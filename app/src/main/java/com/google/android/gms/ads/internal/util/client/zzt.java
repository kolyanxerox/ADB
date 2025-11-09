package com.google.android.gms.ads.internal.util.client;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class zzt {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ zzt[] f16191OooOo0O;
    public static final zzt zza;
    public static final zzt zzb;
    public static final zzt zzc;
    public static final zzt zzd;

    static {
        zzt zztVar = new zzt("SUCCESS", 0);
        zza = zztVar;
        zzt zztVar2 = new zzt("PERMANENT_FAILURE", 1);
        zzb = zztVar2;
        zzt zztVar3 = new zzt("RETRIABLE_FAILURE", 2);
        zzc = zztVar3;
        zzt zztVar4 = new zzt("BUFFERED", 3);
        zzd = zztVar4;
        f16191OooOo0O = new zzt[]{zztVar, zztVar2, zztVar3, zztVar4};
    }

    public static zzt[] values() {
        return (zzt[]) f16191OooOo0O.clone();
    }
}
