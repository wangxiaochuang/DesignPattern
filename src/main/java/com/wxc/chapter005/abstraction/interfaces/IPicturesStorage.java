package com.wxc.chapter005.abstraction.interfaces;

import com.wxc.chapter005.abstraction.Picture;

public interface IPicturesStorage {
    void savePicture(Picture picture);
    Image getPicture(String pictureId);
    void deletePicture(String pictureId);
}