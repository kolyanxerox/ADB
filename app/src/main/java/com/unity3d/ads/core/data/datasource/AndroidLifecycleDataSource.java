package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0ooo.InterfaceC4522o;
import o00O0ooo.o0OO;
import o00O0ooo.o0OOO0;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, LifecycleEventObserver {
    private final o0OO _appActive;
    private final InterfaceC4522o appActive;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", m13472f = "AndroidLifecycleDataSource.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1 */
    public static final class C40081 extends OooOOOO implements o00O0O {
        int label;

        public C40081(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidLifecycleDataSource.this.new C40081(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(AndroidLifecycleDataSource.this);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40081) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidLifecycleDataSource() {
        oO00000o oo00000oOooO0OO = o0o0000.OooO0OO(Boolean.TRUE);
        this._appActive = oo00000oOooO0OO;
        this.appActive = new o0OOO0(oo00000oOooO0OO);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        o0000OO0.OooOo0(o0000OO0.OooO0Oo(), null, new C40081(null), 3);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return ((Boolean) getAppActive().getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public InterfaceC4522o getAppActive() {
        return this.appActive;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        o0OO o0oo = this._appActive;
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean zBooleanValue = true;
        if (i == 1) {
            zBooleanValue = false;
        } else if (i != 2) {
            zBooleanValue = ((Boolean) getAppActive().getValue()).booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        oO00000o oo00000o = (oO00000o) o0oo;
        oo00000o.getClass();
        oo00000o.OooO(null, boolValueOf);
    }
}
