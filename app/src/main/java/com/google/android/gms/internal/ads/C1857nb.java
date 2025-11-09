package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.nb */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1857nb implements wk0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f21460OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ String f21461OooO0O0;

    public /* synthetic */ C1857nb(String str, int i) {
        this.f21460OooO00o = i;
        this.f21461OooO0O0 = str;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final Object apply(Object obj) {
        String strReplace = this.f21461OooO0O0;
        switch (this.f21460OooO00o) {
            case 0:
                String str = (String) obj;
                C1820mb c1820mb = AbstractC2005rb.f23817OooO00o;
                if (str == null) {
                    return strReplace;
                }
                if (((Boolean) AbstractC1596g8.f19264OooO0o.OooOOO()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i = 0; i < 3; i++) {
                        if (!host.endsWith(strArr[i])) {
                        }
                    }
                    return strReplace;
                }
                String str2 = (String) AbstractC1596g8.f19260OooO00o.OooOOO();
                String str3 = (String) AbstractC1596g8.f19261OooO0O0.OooOOO();
                if (!TextUtils.isEmpty(str2)) {
                    strReplace = strReplace.replace(str2, str);
                }
                if (TextUtils.isEmpty(str3)) {
                    return strReplace;
                }
                Uri uri = Uri.parse(strReplace);
                return TextUtils.isEmpty(uri.getQueryParameter(str3)) ? uri.buildUpon().appendQueryParameter(str3, str).toString() : strReplace;
            case 1:
                Throwable th = (Throwable) obj;
                C1820mb c1820mb2 = AbstractC2005rb.f23817OooO00o;
                if (((Boolean) AbstractC1596g8.f19259OooO.OooOOO()).booleanValue()) {
                    zzv.zzp().OooO0oo("prepareClickUrl.attestation2", th);
                }
                return strReplace;
            case 2:
                return new d00(strReplace, (BinderC2298z8) obj);
            default:
                Throwable th2 = (Throwable) obj;
                zzo.zzg("Error calling adapter: ".concat(String.valueOf(strReplace)));
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OOOo)).booleanValue()) {
                    zzv.zzp().OooO0oO("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th2);
                    return null;
                }
                zzv.zzp().OooO0oo("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th2);
                return null;
        }
    }
}
