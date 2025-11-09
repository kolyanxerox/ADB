package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Oooo000;
import o000O00.o00O0O0O;
import o00O.OooOOO0;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oo.o0000oo;
import o00O0oo.o00oOoo;
import o00O0ooo.o0OoOoOo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", m13472f = "AndroidGetLifecycleFlow.kt", m13473l = {64}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2 */
    public static final class C40662 extends OooOOOO implements o00O0O {
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ AndroidGetLifecycleFlow$invoke$2$listener$1 $listener;
            final /* synthetic */ AndroidGetLifecycleFlow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidGetLifecycleFlow androidGetLifecycleFlow, AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1) {
                super(0);
                this.this$0 = androidGetLifecycleFlow;
                this.$listener = androidGetLifecycleFlow$invoke$2$listener$1;
            }

            @Override // o00O0Oo.OooO0O0
            public /* bridge */ /* synthetic */ Object invoke() {
                m13769invoke();
                return OooOo.f33195OooO00o;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13769invoke() {
                ((Application) this.this$0.applicationContext).unregisterActivityLifecycleCallbacks(this.$listener);
            }
        }

        public C40662(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C40662 c40662 = AndroidGetLifecycleFlow.this.new C40662(oooO0OO);
            c40662.L$0 = obj;
            return c40662;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final o00oOoo o00oooo = (o00oOoo) this.L$0;
                ?? r1 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
                        o00oOoo o00oooo2 = o00oooo;
                        o0000OO0.OooOo0(o00oooo2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(o00oooo2, activity, bundle, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
                        o00oOoo o00oooo2 = o00oooo;
                        o0000OO0.OooOo0(o00oooo2, null, new C4067xc7e08ac0(o00oooo2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
                        o00oOoo o00oooo2 = o00oooo;
                        o0000OO0.OooOo0(o00oooo2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(o00oooo2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
                        o00oOoo o00oooo2 = o00oooo;
                        o0000OO0.OooOo0(o00oooo2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(o00oooo2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
                        kotlin.jvm.internal.OooOo.OooO0o0(bundle, "bundle");
                        o00oOoo o00oooo2 = o00oooo;
                        o0000OO0.OooOo0(o00oooo2, null, new C4068xc69cfa6(o00oooo2, activity, bundle, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
                        o00oOoo o00oooo2 = o00oooo;
                        o0000OO0.OooOo0(o00oooo2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(o00oooo2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
                        o00oOoo o00oooo2 = o00oooo;
                        o0000OO0.OooOo0(o00oooo2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(o00oooo2, activity, null), 3);
                    }
                };
                ((Application) AndroidGetLifecycleFlow.this.applicationContext).registerActivityLifecycleCallbacks(r1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidGetLifecycleFlow.this, r1);
                this.label = 1;
                if (o00O0O0O.OooO00o(o00oooo, anonymousClass1, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o00oOoo o00oooo, OooO0OO oooO0OO) {
            return ((C40662) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidGetLifecycleFlow(Context applicationContext) {
        kotlin.jvm.internal.OooOo.OooO0o0(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final o0OoOoOo invoke() {
        if (this.applicationContext instanceof Application) {
            return new OooOOO0(new C40662(null), OooOOO.f31358OooOo0O, -2, o0000oo.f31602OooOo0O);
        }
        throw new IllegalArgumentException("Application context is required");
    }
}
