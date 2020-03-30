package com.wxc.chapter005.abstraction.impl;

import com.wxc.chapter005.abstraction.Picture;
import com.wxc.chapter005.abstraction.interfaces.IPicturesStorage;
import com.wxc.chapter005.abstraction.interfaces.Image;

public class PictureStorage implements IPicturesStorage {

    @Override
    public void savePicture(Picture picture) {
    }

    @Override
    public Image getPicture(String pictureId) {
        return null;
    }

    @Override
    public void deletePicture(String pictureId) { }

}