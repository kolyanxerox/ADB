package com.applovin.impl;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.g7 */
/* loaded from: classes.dex */
public class C1038g7 {

    /* renamed from: a */
    private final Intent f784a = new Intent();

    /* renamed from: a */
    public C1038g7 m802a(String str, String str2) {
        boolean zIsValidString = StringUtils.isValidString(str);
        boolean zIsValidString2 = StringUtils.isValidString(str2);
        if (zIsValidString && zIsValidString2) {
            this.f784a.setDataAndType(Uri.parse(str), str2);
            return this;
        }
        if (zIsValidString) {
            this.f784a.setData(Uri.parse(str));
            return this;
        }
        if (zIsValidString2) {
            this.f784a.setType(str2);
        }
        return this;
    }

    /* renamed from: b */
    public C1038g7 m804b(String str) {
        if (StringUtils.isValidString(str)) {
            this.f784a.addFlags(Integer.parseInt(str));
        }
        return this;
    }

    /* renamed from: c */
    public Intent m806c(String str) {
        Intent intentCreateChooser = Intent.createChooser(this.f784a, StringUtils.emptyIfNull(str));
        intentCreateChooser.addFlags(this.f784a.getFlags());
        return intentCreateChooser;
    }

    /* renamed from: d */
    public C1038g7 m807d(String str) {
        if (StringUtils.isValidString(str)) {
            this.f784a.setAction(str);
        }
        return this;
    }

    /* renamed from: e */
    public C1038g7 m808e(String str) {
        if (StringUtils.isValidString(str)) {
            this.f784a.putExtras(JsonUtils.toBundle(JsonUtils.jsonObjectFromJsonString(str, new JSONObject())));
        }
        return this;
    }

    /* renamed from: f */
    public C1038g7 m809f(String str) {
        if (StringUtils.isValidString(str) && AbstractC1141o0.m1954j()) {
            this.f784a.setIdentifier(str);
        }
        return this;
    }

    /* renamed from: g */
    public C1038g7 m810g(String str) {
        if (StringUtils.isValidString(str)) {
            this.f784a.setSelector(new Intent(str));
        }
        return this;
    }

    /* renamed from: h */
    public C1038g7 m811h(String str) {
        if (StringUtils.isValidString(str)) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length == 4) {
                this.f784a.setSourceBounds(new Rect(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Integer.parseInt(strArrSplit[3])));
            }
        }
        return this;
    }

    /* renamed from: b */
    public C1038g7 m805b(String str, String str2, String str3) {
        if (StringUtils.isValidString(str)) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString != null) {
                this.f784a.setComponent(componentNameUnflattenFromString);
                return this;
            }
        } else {
            if (StringUtils.isValidString(str2) && StringUtils.isValidString(str3)) {
                this.f784a.setClassName(str3, str2);
                return this;
            }
            if (StringUtils.isValidString(str3)) {
                this.f784a.setPackage(str3);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1038g7 m801a(String str) {
        if (StringUtils.isValidString(str)) {
            for (String str2 : str.split(",")) {
                this.f784a.addCategory(str2);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1038g7 m803a(String str, String str2, String str3) {
        ClipData clipDataNewRawUri;
        if (StringUtils.isValidString(str)) {
            Uri uri = Uri.parse(str);
            if (StringUtils.isValidString(str2)) {
                clipDataNewRawUri = new ClipData(new ClipDescription(StringUtils.emptyIfNull(str3), new String[]{str2}), new ClipData.Item(uri));
            } else {
                clipDataNewRawUri = ClipData.newRawUri(StringUtils.emptyIfNull(str3), uri);
            }
            this.f784a.setClipData(clipDataNewRawUri);
        }
        return this;
    }

    /* renamed from: a */
    public Intent m800a() {
        return this.f784a;
    }
}
