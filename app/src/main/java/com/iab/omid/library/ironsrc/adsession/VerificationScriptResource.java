package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.utils.C2558c;
import com.iab.omid.library.ironsrc.utils.C2562g;
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
        C2562g.m4417a(str, "VendorKey is null or empty");
        C2562g.m4415a(url, "ResourceURL is null");
        C2562g.m4417a(str2, "VerificationParameters is null or empty");
        return new VerificationScriptResource(str, url, str2);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL url) {
        C2562g.m4415a(url, "ResourceURL is null");
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
        C2558c.m4390a(jSONObject, "vendorKey", this.vendorKey);
        C2558c.m4390a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        C2558c.m4390a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
