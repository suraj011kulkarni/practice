package com.interview.preparation.test;

import com.interview.preparation.Tasks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TaskTester {


    private int a;
    private int b;
    private int sum;
    private Tasks tasks;

    public TaskTester(int a, int b, int sum, Tasks tasks) {
        this.a = a;
        this.b = b;
        this.sum = sum;
        this.tasks = tasks;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{1,2,3},{2,2,4}});

    }



    @Test
    public void testAdd(){

        assertEquals(sum,tasks.add(a,b));
        //assertEquals(1,1);

    }


}
