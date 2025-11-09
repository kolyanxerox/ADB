package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ud0 {

    /* renamed from: OooO, reason: collision with root package name */
    public zzy f24624OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public zzm f24625OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public zzs f24626OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f24627OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public zzga f24628OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f24629OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f24630OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public ArrayList f24631OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public C1414b9 f24632OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public AdManagerAdViewOptions f24633OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public PublisherAdViewOptions f24634OooOO0O;
    public zzcm OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public C1418bd f24635OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public int f24636OooOOO0 = 1;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final Oooo0oO.o0000Ooo f24637OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public boolean f24638OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public c90 f24639OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public boolean f24640OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public boolean f24641OooOOoo;
    public zzcq OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public Bundle f24642OooOo00;

    public ud0() {
        Oooo0oO.o0000Ooo o0000ooo = new Oooo0oO.o0000Ooo();
        o0000ooo.f13884OooOo0o = 2;
        this.f24637OooOOOO = o0000ooo;
        this.f24638OooOOOo = false;
        this.f24640OooOOo0 = false;
        this.f24641OooOOoo = false;
    }

    public final vd0 OooO00o() {
        Oooo00O.o000000O.OooO(this.f24627OooO0OO, "ad unit must not be null");
        Oooo00O.o000000O.OooO(this.f24626OooO0O0, "ad size must not be null");
        Oooo00O.o000000O.OooO(this.f24625OooO00o, "ad request must not be null");
        return new vd0(this);
    }
}
