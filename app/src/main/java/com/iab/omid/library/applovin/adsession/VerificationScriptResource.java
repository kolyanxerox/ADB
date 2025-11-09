package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.utils.C2507c;
import com.iab.omid.library.applovin.utils.C2511g;
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
        C2511g.m4164a(str, "VendorKey is null or empty");
        C2511g.m4162a(url, "ResourceURL is null");
        C2511g.m4164a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C2511g.m4162a(url, "ResourceURL is null");
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
        C2507c.m4137a(jSONObject, "vendorKey", this.vendorKey);
        C2507c.m4137a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C2507c.m4137a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
