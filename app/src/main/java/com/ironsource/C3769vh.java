package com.ironsource;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.vh */
/* loaded from: classes2.dex */
public class C3769vh extends File {
    public C3769vh(String str) {
        super(str);
    }

    /* renamed from: a */
    public JSONObject m12784a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    @Override // java.io.File
    public String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public C3769vh(String str, String str2) {
        super(str, str2);
    }
}
