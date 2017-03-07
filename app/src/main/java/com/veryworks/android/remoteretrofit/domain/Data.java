package com.veryworks.android.remoteretrofit.domain;

/**
 * Created by pc on 3/7/2017.
 */

public class Data
{
    private SearchParkingInfo SearchParkingInfo;

    public SearchParkingInfo getSearchParkingInfo ()
    {
        return SearchParkingInfo;
    }

    public void setSearchParkingInfo (SearchParkingInfo SearchParkingInfo)
    {
        this.SearchParkingInfo = SearchParkingInfo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SearchParkingInfo = "+SearchParkingInfo+"]";
    }
}
