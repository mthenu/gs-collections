/*
 * Copyright 2011 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.impl.block.function;

import org.junit.Assert;
import org.junit.Test;

public class MinAndMaxBlocksTest
{
    private static final Double FORTY_TWO_DOUBLE = 42.0;
    private static final Integer FORTY_TWO_INTEGER = 42;
    private static final Long FORTY_TWO_LONG = 42L;

    @Test
    public void minBlocks()
    {
        Assert.assertEquals(new Double(1.0), MinFunction.DOUBLE.value(1.0, 2.0));
        Assert.assertEquals(new Double(0.0), MinFunction.DOUBLE.value(0.0, 1.0));
        Assert.assertEquals(new Double(-1.0), MinFunction.DOUBLE.value(1.0, -1.0));

        Assert.assertEquals(Integer.valueOf(1), MinFunction.INTEGER.value(1, 2));
        Assert.assertEquals(Integer.valueOf(0), MinFunction.INTEGER.value(0, 1));
        Assert.assertEquals(Integer.valueOf(-1), MinFunction.INTEGER.value(1, -1));

        Assert.assertEquals(Long.valueOf(1L), MinFunction.LONG.value(1L, 2L));
        Assert.assertEquals(Long.valueOf(0L), MinFunction.LONG.value(0L, 1L));
        Assert.assertEquals(Long.valueOf(-1L), MinFunction.LONG.value(1L, -1L));
    }

    @Test
    public void minBlocksNull()
    {
        Assert.assertSame(FORTY_TWO_DOUBLE, MinFunction.DOUBLE.value(null, FORTY_TWO_DOUBLE));
        Assert.assertSame(FORTY_TWO_DOUBLE, MinFunction.DOUBLE.value(FORTY_TWO_DOUBLE, null));
        Assert.assertSame(null, MinFunction.DOUBLE.value(null, null));

        Assert.assertSame(FORTY_TWO_INTEGER, MinFunction.INTEGER.value(null, FORTY_TWO_INTEGER));
        Assert.assertSame(FORTY_TWO_INTEGER, MinFunction.INTEGER.value(FORTY_TWO_INTEGER, null));
        Assert.assertSame(null, MinFunction.INTEGER.value(null, null));

        Assert.assertSame(FORTY_TWO_LONG, MinFunction.LONG.value(null, FORTY_TWO_LONG));
        Assert.assertSame(FORTY_TWO_LONG, MinFunction.LONG.value(FORTY_TWO_LONG, null));
        Assert.assertSame(null, MinFunction.LONG.value(null, null));
    }

    @Test
    public void maxBlocks()
    {
        Assert.assertEquals(new Double(2.0), MaxFunction.DOUBLE.value(1.0, 2.0));
        Assert.assertEquals(new Double(1.0), MaxFunction.DOUBLE.value(0.0, 1.0));
        Assert.assertEquals(new Double(1.0), MaxFunction.DOUBLE.value(1.0, -1.0));

        Assert.assertEquals(Integer.valueOf(2), MaxFunction.INTEGER.value(1, 2));
        Assert.assertEquals(Integer.valueOf(1), MaxFunction.INTEGER.value(0, 1));
        Assert.assertEquals(Integer.valueOf(1), MaxFunction.INTEGER.value(1, -1));

        Assert.assertEquals(Long.valueOf(2L), MaxFunction.LONG.value(1L, 2L));
        Assert.assertEquals(Long.valueOf(1L), MaxFunction.LONG.value(0L, 1L));
        Assert.assertEquals(Long.valueOf(1L), MaxFunction.LONG.value(1L, -1L));
    }

    @Test
    public void maxBlocksNull()
    {
        Assert.assertSame(FORTY_TWO_DOUBLE, MaxFunction.DOUBLE.value(null, FORTY_TWO_DOUBLE));
        Assert.assertSame(FORTY_TWO_DOUBLE, MaxFunction.DOUBLE.value(FORTY_TWO_DOUBLE, null));
        Assert.assertSame(null, MaxFunction.DOUBLE.value(null, null));

        Assert.assertSame(FORTY_TWO_INTEGER, MaxFunction.INTEGER.value(null, FORTY_TWO_INTEGER));
        Assert.assertSame(FORTY_TWO_INTEGER, MaxFunction.INTEGER.value(FORTY_TWO_INTEGER, null));
        Assert.assertSame(null, MaxFunction.INTEGER.value(null, null));

        Assert.assertSame(FORTY_TWO_LONG, MaxFunction.LONG.value(null, FORTY_TWO_LONG));
        Assert.assertSame(FORTY_TWO_LONG, MaxFunction.LONG.value(FORTY_TWO_LONG, null));
        Assert.assertSame(null, MaxFunction.LONG.value(null, null));
    }
}
