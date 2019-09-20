package com.jp.core;

import com.jp.stereotypes.Mapper;
import javafx.scene.shape.Rectangle;

import java.util.Map;
import java.util.Set;

/**
 * This is the robot that will find its way around a space and try to map it out.
 *
 * Created by JP on 4/4/2017.
 */
public class Robot implements Mapper{

    private Map<Rectangle, Set> map;


    @Override
    public void map() {

    }

    @Override
    public Set getMap() {
        return null;
    }
}
