package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class sb0 implements kb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f24054OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f24055OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final cq0 f24056OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f24057OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f24058OooO0o0;

    public sb0(C1756kl c1756kl, Context context, ScheduledExecutorService scheduledExecutorService, cq0 cq0Var, int i, boolean z, boolean z2) {
        this.f24054OooO00o = context;
        this.f24055OooO0O0 = scheduledExecutorService;
        this.f24056OooO0OO = cq0Var;
        this.f24057OooO0Oo = z;
        this.f24058OooO0o0 = z2;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        C2274yl c2274yl = new C2274yl();
        zzbc.zzb();
        Context context = this.f24054OooO00o;
        if (zzf.zzt(context)) {
            AbstractC2200wl.f25321OooO00o.execute(new RunnableC1719jl(context, c2274yl));
        }
        tp0 tp0VarOooOOo = tp0.OooOOo(c2274yl);
        final int i = 0;
        wk0 wk0Var = new wk0(this) { // from class: com.google.android.gms.internal.ads.rb0

            /* renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ sb0 f23844OooO0O0;

            {
                this.f23844OooO0O0 = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.wk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L2c;
                        default: goto L5;
                    }
                L5:
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    com.google.android.gms.internal.ads.sb0 r9 = r8.f23844OooO0O0
                    r9.getClass()
                    com.google.android.gms.ads.internal.client.zzbc.zzb()
                    android.content.Context r9 = r9.f24054OooO00o
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L1a
                    r9 = r0
                    goto L20
                L1a:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                L20:
                    com.google.android.gms.internal.ads.tb0 r1 = new com.google.android.gms.internal.ads.tb0
                    OoooOOO.o0O0O0O r2 = new OoooOOO.o0O0O0O
                    r3 = 7
                    r2.<init>(r3)
                    r1.<init>(r0, r9, r2)
                    return r1
                L2c:
                    com.google.android.gms.internal.ads.sb0 r0 = r8.f23844OooO0O0
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9
                    r0.getClass()
                    OoooOOO.o0O0O0O r1 = new OoooOOO.o0O0O0O
                    r2 = 7
                    r1.<init>(r2)
                    boolean r2 = r0.f24057OooO0Oo
                    if (r2 != 0) goto L4f
                    com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.f17887o00O0ooo
                    com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
                    java.lang.Object r2 = r3.OooO00o(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L65
                L4f:
                    boolean r2 = r0.f24057OooO0Oo
                    if (r2 == 0) goto Laf
                    com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.f17855o00O
                    com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
                    java.lang.Object r2 = r3.OooO00o(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto Laf
                L65:
                    android.content.Context r1 = r0.f24054OooO00o     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    com.google.android.gms.internal.ads.uj0 r2 = com.google.android.gms.internal.ads.uj0.OooO0o(r1)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.String r3 = r9.getId()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    android.content.Context r1 = r0.f24054OooO00o     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.f17893o00OO0O0     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    com.google.android.gms.internal.ads.a7 r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.Object r1 = r5.OooO00o(r1)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    boolean r7 = r0.f24058OooO0o0     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.Class<com.google.android.gms.internal.ads.uj0> r1 = com.google.android.gms.internal.ads.uj0.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    OoooOOO.o0O0O0O r0 = r2.OooO00o(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9a
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
                    r1 = r0
                    goto Laf
                L9a:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                L9d:
                    r0 = move-exception
                    goto La0
                L9f:
                    r0 = move-exception
                La0:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    com.google.android.gms.internal.ads.ql r2 = com.google.android.gms.ads.internal.zzv.zzp()
                    r2.OooO0oo(r1, r0)
                    OoooOOO.o0O0O0O r1 = new OoooOOO.o0O0O0O
                    r0 = 7
                    r1.<init>(r0)
                Laf:
                    com.google.android.gms.internal.ads.tb0 r0 = new com.google.android.gms.internal.ads.tb0
                    r2 = 0
                    r0.<init>(r9, r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rb0.apply(java.lang.Object):java.lang.Object");
            }
        };
        cq0 cq0Var = this.f24056OooO0OO;
        final int i2 = 1;
        return ii0.OoooOOO((tp0) ii0.o00Oo0(ii0.Ooooooo(tp0VarOooOOo, wk0Var, cq0Var), ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17792o0000OoO)).longValue(), TimeUnit.MILLISECONDS, this.f24055OooO0O0), Throwable.class, new wk0(this) { // from class: com.google.android.gms.internal.ads.rb0

            /* renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ sb0 f23844OooO0O0;

            {
                this.f23844OooO0O0 = this;
            }

            @Override // com.google.android.gms.internal.ads.wk0
            public final Object apply(Object v) {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L2c;
                        default: goto L5;
                    }
                L5:
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    com.google.android.gms.internal.ads.sb0 r9 = r8.f23844OooO0O0
                    r9.getClass()
                    com.google.android.gms.ads.internal.client.zzbc.zzb()
                    android.content.Context r9 = r9.f24054OooO00o
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L1a
                    r9 = r0
                    goto L20
                L1a:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                L20:
                    com.google.android.gms.internal.ads.tb0 r1 = new com.google.android.gms.internal.ads.tb0
                    OoooOOO.o0O0O0O r2 = new OoooOOO.o0O0O0O
                    r3 = 7
                    r2.<init>(r3)
                    r1.<init>(r0, r9, r2)
                    return r1
                L2c:
                    com.google.android.gms.internal.ads.sb0 r0 = r8.f23844OooO0O0
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9
                    r0.getClass()
                    OoooOOO.o0O0O0O r1 = new OoooOOO.o0O0O0O
                    r2 = 7
                    r1.<init>(r2)
                    boolean r2 = r0.f24057OooO0Oo
                    if (r2 != 0) goto L4f
                    com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.f17887o00O0ooo
                    com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
                    java.lang.Object r2 = r3.OooO00o(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L65
                L4f:
                    boolean r2 = r0.f24057OooO0Oo
                    if (r2 == 0) goto Laf
                    com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.f17855o00O
                    com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
                    java.lang.Object r2 = r3.OooO00o(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto Laf
                L65:
                    android.content.Context r1 = r0.f24054OooO00o     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    com.google.android.gms.internal.ads.uj0 r2 = com.google.android.gms.internal.ads.uj0.OooO0o(r1)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.String r3 = r9.getId()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    android.content.Context r1 = r0.f24054OooO00o     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.f17893o00OO0O0     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    com.google.android.gms.internal.ads.a7 r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.Object r1 = r5.OooO00o(r1)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    boolean r7 = r0.f24058OooO0o0     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    java.lang.Class<com.google.android.gms.internal.ads.uj0> r1 = com.google.android.gms.internal.ads.uj0.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                    OoooOOO.o0O0O0O r0 = r2.OooO00o(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9a
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
                    r1 = r0
                    goto Laf
                L9a:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L9d java.io.IOException -> L9f
                L9d:
                    r0 = move-exception
                    goto La0
                L9f:
                    r0 = move-exception
                La0:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    com.google.android.gms.internal.ads.ql r2 = com.google.android.gms.ads.internal.zzv.zzp()
                    r2.OooO0oo(r1, r0)
                    OoooOOO.o0O0O0O r1 = new OoooOOO.o0O0O0O
                    r0 = 7
                    r1.<init>(r0)
                Laf:
                    com.google.android.gms.internal.ads.tb0 r0 = new com.google.android.gms.internal.ads.tb0
                    r2 = 0
                    r0.<init>(r9, r2, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rb0.apply(java.lang.Object):java.lang.Object");
            }
        }, cq0Var);
    }
}
