/*
 * Copyright (c) 2019-present unTill Pro, Ltd. and Contributors
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package assesment_typeconv;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ConvertorTest {

    @Parameter
    public int id;

    @Parameters(name = "{index}: ID - {0}")
    public static Object[] data() {
        return new Object[]{
                -2147483648,
                0,
                2147483647,
                1684522315,
                123
        };
    }

    @Test
    public void crackUncrack() {
        Assert.assertEquals(id, Convertor.uncrack(Convertor.crack(id)));
    }
}
