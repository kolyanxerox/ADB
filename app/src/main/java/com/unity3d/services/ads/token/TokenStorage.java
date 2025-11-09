package com.unity3d.services.ads.token;

import oo00o.OooOo;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public interface TokenStorage {
    void appendTokens(JSONArray jSONArray) throws JSONException;

    void createTokens(JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    OooOo getNativeGeneratedToken();

    String getToken();

    void setInitToken(String str);
}
