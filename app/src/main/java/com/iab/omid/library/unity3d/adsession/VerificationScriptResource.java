package com.iab.omid.library.unity3d.adsession;

import com.iab.omid.library.unity3d.utils.C2605c;
import com.iab.omid.library.unity3d.utils.C2609g;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VerificationScriptResource {
    private final URL resourceUrl;
    private final String vendorKey;
    private final String verificationParameters;

    private VerificationScriptResource(String str, URL url, String str2) {
        this.vendorKey = str;
        this.resourceUrl = url;
        this.verificationParameters = str2;
    }

    public static VerificationScriptResource createVerificationScriptResourceWithParameters(String str, URL url, String str2) {
        C2609g.m4656a(str, "VendorKey is null or empty");
        C2609g.m4654a(url, "ResourceURL is null");
        C2609g.m4656a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C2609g.m4654a(url, "ResourceURL is null");
        return new VerificationScriptResource(null, url, null);
    }

    public URL getResourceUrl() {
        return this.resourceUrl;
    }

    public String getVendorKey() {
        return this.vendorKey;
    }

    public String getVerificationParameters() {
        return this.verificationParameters;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2605c.m4631a(jSONObject, "vendorKey", this.vendorKey);
        C2605c.m4631a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C2605c.m4631a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
