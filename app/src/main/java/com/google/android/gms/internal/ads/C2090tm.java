package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.tm */
/* loaded from: classes2.dex */
public final class C2090tm {

    /* renamed from: OooOOo, reason: collision with root package name */
    public static final boolean f24330OooOOo;

    /* renamed from: OooO, reason: collision with root package name */
    public boolean f24331OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f24332OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f24333OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final VersionInfoParcel f24334OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C1558f7 f24335OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final zzbh f24336OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final C1669i7 f24337OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final long[] f24338OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String[] f24339OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public boolean f24340OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f24341OooOO0O;
    public boolean OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public AbstractC1684im f24342OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public boolean f24343OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public boolean f24344OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public boolean f24345OooOOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public long f24346OooOOo0;

    static {
        f24330OooOOo = zzbc.zze().nextInt(100) < ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O0OO)).intValue();
    }

    public C2090tm(Context context, VersionInfoParcel versionInfoParcel, String str, C1669i7 c1669i7, C1558f7 c1558f7) {
        zzbf zzbfVar = new zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f24336OooO0o = zzbfVar.zzb();
        this.f24331OooO = false;
        this.f24340OooOO0 = false;
        this.f24341OooOO0O = false;
        this.OooOO0o = false;
        this.f24346OooOOo0 = -1L;
        this.f24332OooO00o = context;
        this.f24334OooO0OO = versionInfoParcel;
        this.f24333OooO0O0 = str;
        this.f24337OooO0o0 = c1669i7;
        this.f24335OooO0Oo = c1558f7;
        String str2 = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17747Oooo0oO);
        if (str2 == null) {
            this.f24339OooO0oo = new String[0];
            this.f24338OooO0oO = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f24339OooO0oo = new String[length];
        this.f24338OooO0oO = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.f24338OooO0oO[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                zzo.zzk("Unable to parse frame hash target time number.", e);
                this.f24338OooO0oO[i] = -1;
            }
        }
    }

    public final void OooO00o(AbstractC1684im abstractC1684im) {
        C1669i7 c1669i7 = this.f24337OooO0o0;
        ze0.OooOOO0(c1669i7, this.f24335OooO0Oo, "vpc2");
        this.f24331OooO = true;
        c1669i7.OooO0O0("vpn", abstractC1684im.OooOOo0());
        this.f24342OooOOO = abstractC1684im;
    }

    public final void OooO0O0() {
        this.f24343OooOOO0 = true;
        if (!this.f24340OooOO0 || this.f24341OooOO0O) {
            return;
        }
        ze0.OooOOO0(this.f24337OooO0o0, this.f24335OooO0Oo, "vfp2");
        this.f24341OooOO0O = true;
    }

    public final void OooO0OO() {
        if (!f24330OooOOo || this.f24344OooOOOO) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f24333OooO0O0);
        bundle.putString("player", this.f24342OooOOO.OooOOo0());
        for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.f24336OooO0o.zza()) {
            String strValueOf = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbeVar.zze));
            String strValueOf2 = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbeVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.f24338OooO0oO;
            if (i >= jArr.length) {
                zzv.zzq().zzi(this.f24332OooO00o, this.f24334OooO0OO.afmaVersion, "gmob-apps", bundle, true);
                this.f24344OooOOOO = true;
                return;
            }
            String str = this.f24339OooO0oo[i];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
            }
            i++;
        }
    }

    public final void OooO0Oo(AbstractC1684im abstractC1684im) {
        if (this.f24341OooOO0O && !this.OooOO0o) {
            if (zze.zzc() && !this.OooOO0o) {
                zze.zza("VideoMetricsMixin first frame");
            }
            ze0.OooOOO0(this.f24337OooO0o0, this.f24335OooO0Oo, "vff2");
            this.OooOO0o = true;
        }
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        long jNanoTime = System.nanoTime();
        if (this.f24343OooOOO0 && this.f24345OooOOOo && this.f24346OooOOo0 != -1) {
            this.f24336OooO0o.zzb(TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.f24346OooOOo0));
        }
        this.f24345OooOOOo = this.f24343OooOOO0;
        this.f24346OooOOo0 = jNanoTime;
        long jLongValue = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17748Oooo0oo)).longValue();
        long jOooO = abstractC1684im.OooO();
        int i = 0;
        while (true) {
            String[] strArr = this.f24339OooO0oo;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && jLongValue > Math.abs(jOooO - this.f24338OooO0oO[i])) {
                int i2 = 8;
                Bitmap bitmap = abstractC1684im.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }
}
