package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MetaData {

    /* renamed from: a */
    private String f9910a;

    /* renamed from: b */
    private List<String> f9911b;

    /* renamed from: c */
    private List<MetaDataValueTypes> f9912c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f9910a = str;
        this.f9911b = list;
        this.f9912c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.f9912c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public String getMetaDataKey() {
        return this.f9910a;
    }

    public List<String> getMetaDataValue() {
        return this.f9911b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f9912c;
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f9910a = str;
        this.f9911b = list;
        this.f9912c = list2;
    }
}
