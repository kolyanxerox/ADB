package com.applovin.impl;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.C3192hm;
import com.unity3d.mediation.LevelPlayAdError;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class o00Oo0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15777OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15778OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ long f15779OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15780OooOoO0;

    public /* synthetic */ o00Oo0(AbstractRunnableC1036g5 abstractRunnableC1036g5, Thread thread, long j) {
        this.f15778OooOo0O = 0;
        this.f15777OooOo = abstractRunnableC1036g5;
        this.f15780OooOoO0 = thread;
        this.f15779OooOo0o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15778OooOo0O) {
            case 0:
                ((AbstractRunnableC1036g5) this.f15777OooOo).m790a((Thread) this.f15780OooOoO0, this.f15779OooOo0o);
                break;
            case 1:
                C3192hm.m9168a((C3192hm) this.f15777OooOo, this.f15779OooOo0o, (LevelPlayAdError) this.f15780OooOoO0);
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.handleSetSessionTimeoutDuration$lambda$6((FlutterFirebaseAnalyticsPlugin) this.f15777OooOo, this.f15779OooOo0o, (TaskCompletionSource) this.f15780OooOoO0);
                break;
        }
    }

    public /* synthetic */ o00Oo0(Object obj, long j, Object obj2, int i) {
        this.f15778OooOo0O = i;
        this.f15777OooOo = obj;
        this.f15779OooOo0o = j;
        this.f15780OooOoO0 = obj2;
    }
}
