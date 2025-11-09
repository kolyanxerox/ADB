package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.core.domain.LifecycleEvent;
import java.lang.ref.WeakReference;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1", m13472f = "AndroidGetLifecycleFlow.kt", m13473l = {38}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ o00oOoo $$this$channelFlow;
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(o00oOoo o00oooo, Activity activity, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$$this$channelFlow = o00oooo;
        this.$activity = activity;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(this.$$this$channelFlow, this.$activity, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            o00oOoo o00oooo = this.$$this$channelFlow;
            LifecycleEvent.Started started = new LifecycleEvent.Started(new WeakReference(this.$activity));
            this.label = 1;
            if (((o0O0ooO) o00oooo).f31651OooOoO0.OooOOO0(started, this) == oooOo00) {
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
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
