package com.kissassert;

import static java.util.Collections.emptyIterator;
import static java.util.Collections.emptyList;

import org.junit.Test;

/**
 * @author <a href="mailto:vincent@potucek.com">Vincent Potucek</a>
 */
public class AssertTestFailure {

    @Test(expected = IllegalArgumentException.class)
    public void notTrue() throws Exception {
        Assert.notTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notFalse() throws Exception {
        Assert.notFalse(false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notNull() throws Exception {
        Assert.notNull(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notEmpty_string() throws Exception {
        Assert.notEmpty("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void notBlank() throws Exception {
        Assert.notBlank(" ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void notEmpty_collection() throws Exception {
        Assert.notEmpty(emptyList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void notEmpty_iterator() throws Exception {
        Assert.notEmpty(emptyIterator());
    }
}