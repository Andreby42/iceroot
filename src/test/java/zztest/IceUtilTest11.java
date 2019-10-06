package zztest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.icexxx.util.IceUtil;

public class IceUtilTest11 {
    // @Test
    public void test1() {
        List<String> list = null;
        assertEquals("错误", IceUtil.length(list), 0);
    }

    // @Test
    public void test2() {
        List<String> list = new ArrayList<String>();
        assertEquals("错误", IceUtil.length(list), 0);
    }

    // @Test
    public void test3() {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        assertEquals("错误", IceUtil.length(list), 1);
    }

    // @Test
    public void test4() {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        assertEquals("错误", IceUtil.length(list), 2);
    }

    // @Test
    public void test5() {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        assertEquals("错误", IceUtil.length(list), 3);
    }
}
