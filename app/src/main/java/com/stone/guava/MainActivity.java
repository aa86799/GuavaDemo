package com.stone.guava;

import android.app.Activity;
import android.os.Bundle;

import com.stone.guava.basicutils.OptionalTest;


/**
 * desc   :
 * author : stone
 * email  : aa86799@163.com
 * time   : 25/01/2017 16 31
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OptionalTest.of("11");

        OptionalTest.absent();

        OptionalTest.fromNullable(null);

        OptionalTest.get(22);

        OptionalTest.or(33);

        OptionalTest.orNull(33);

        OptionalTest.asSet(22);

    }
}
