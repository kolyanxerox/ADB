package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.ironsource.C3034d9;

/* renamed from: com.google.android.gms.internal.ads.i1 */
/* loaded from: classes2.dex */
public final class C1663i1 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f19891OooO0OO = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String[] f19892OooO00o = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC1552f1 f19893OooO0O0;

    public C1663i1(InterfaceC1552f1 interfaceC1552f1) {
        this.f19893OooO0O0 = interfaceC1552f1;
    }

    public static Uri OooO0Oo(Uri uri, String str) throws C1699j1 {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals("ad.doubleclick.net")) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new C1699j1("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i = iIndexOf + 1;
                            return Uri.parse(string.substring(0, i) + "dc_ms=" + str + ";" + string.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new C1699j1("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i2) + "ms=" + str + C3034d9.i.f8175c + string2.substring(i2));
        } catch (UnsupportedOperationException unused2) {
            throw new C1699j1("Provided Uri is not in a valid state");
        }
    }

    public final Uri OooO00o(Uri uri, Context context, View view, Activity activity) throws C1699j1 {
        try {
            return OooO0Oo(uri, this.f19893OooO0O0.zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C1699j1("Provided Uri is not in a valid state");
        }
    }

    public final boolean OooO0O0(Uri uri) {
        if (OooO0OO(uri)) {
            String[] strArr = f19891OooO0OO;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean OooO0OO(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f19892OooO00o;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
