package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.og */
/* loaded from: classes2.dex */
public final class C1900og extends C2249xx {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Activity f22985OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Map f22986OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final String f22987OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final long f22988OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final long f22989OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final String f22990OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final String f22991OooOooo;

    public C1900og(InterfaceC1722jo interfaceC1722jo, Map map) throws NumberFormatException {
        long j;
        super(16, interfaceC1722jo, "createCalendarEvent");
        this.f22986OooOoO0 = map;
        this.f22985OooOoO = interfaceC1722jo.zzi();
        this.f22987OooOoOO = OooOOo("description");
        this.f22990OooOooO = OooOOo("summary");
        String str = (String) map.get("start_ticks");
        long j2 = -1;
        if (str == null) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        this.f22989OooOoo0 = j;
        String str2 = (String) this.f22986OooOoO0.get("end_ticks");
        if (str2 != null) {
            try {
                j2 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f22988OooOoo = j2;
        this.f22991OooOooo = OooOOo("location");
    }

    public final String OooOOo(String str) {
        Map map = this.f22986OooOoO0;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
