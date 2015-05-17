package com.dxd.test4bs;

public class Result {
    private String mContents;
    private BarcodeFormat mBarcodeFormat;

    public void setContents(String contents) {
        mContents = contents;
    }

    public void setBarcodeFormat(BarcodeFormat format) {
        mBarcodeFormat = format;
    }

    public BarcodeFormat getBarcodeFormat() {
        return mBarcodeFormat;
    }

    public String getContents() {
        return mContents;
    }
}