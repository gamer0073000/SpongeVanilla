package org.granitemc.granite.api.world;

/*****************************************************************************************
 * License (MIT)
 *
 * Copyright (c) 2014. Granite Team
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ****************************************************************************************/

public interface WorldBorder {
    public World getWorld();

    public Location getBorderCenter();

    public double getBorderSize();

    public void setBorderSize(double d);

    // TODO: check if necessary
    /*public long getBorderSizeLerpTime();

    public void setBorderSizeLerpTime(long l);

    public double getBorderSizeLerpTarget();

    public void setBorderSizeLerpTarget(double d);*/

    public void setBorderCenter(Location l);

    public double getBorderSafeZone();

    public void setBorderSafeZone(double d);

    public double getBorderDamagePerBlock();

    public void setBorderDamagePerBlock(double d);

    public int getBorderWarningBlocks();

    public int getBorderWarningTime();

    public void setBorderWarningBlocks(int i);

    public void setBorderWarningTime(int i);
}