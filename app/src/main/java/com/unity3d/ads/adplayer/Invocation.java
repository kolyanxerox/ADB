package com.unity3d.ads.adplayer;

import java.lang.reflect.InvocationTargetException;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0oOo.o00000;
import o00O0oOo.o00000O0;
import o00O0oOo.o0000OO0;
import o00O0oOo.o0000Ooo;
import o00O0oOo.o000O0o;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes2.dex */
public final class Invocation {
    private final o00000 _isHandled;
    private final o00000 completableDeferred;
    private final String location;
    private final Object[] parameters;

    @OooO(m13471c = "com.unity3d.ads.adplayer.Invocation$handle$2", m13472f = "Invocation.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.Invocation$handle$2 */
    public static final class C39742 extends OooOOOO implements Oooo000 {
        int label;

        public C39742(OooO0OO oooO0OO) {
            super(1, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(OooO0OO oooO0OO) {
            return new C39742(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.Oooo000
        public final Object invoke(OooO0OO oooO0OO) {
            return ((C39742) create(oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.Invocation$handle$3", m13472f = "Invocation.kt", m13473l = {23}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.Invocation$handle$3 */
    public static final class C39753 extends OooOOOO implements o00O0O {
        final /* synthetic */ Oooo000 $handler;
        int label;
        final /* synthetic */ Invocation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39753(Oooo000 oooo000, Invocation invocation, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$handler = oooo000;
            this.this$0 = invocation;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C39753(this.$handler, this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            try {
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    Oooo000 oooo000 = this.$handler;
                    this.label = 1;
                    obj = oooo000.invoke(this);
                    if (obj == oooOo00) {
                        return oooOo00;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000OOo.OooOO0O(obj);
                }
                ((o00000O0) this.this$0.completableDeferred).Oooo0oO(obj);
            } catch (Throwable th) {
                o00000O0 o00000o02 = (o00000O0) this.this$0.completableDeferred;
                o00000o02.getClass();
                o00000o02.Oooo0oO(new o0000Ooo(false, th));
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C39753) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public Invocation(String location, Object[] parameters) {
        kotlin.jvm.internal.OooOo.OooO0o0(location, "location");
        kotlin.jvm.internal.OooOo.OooO0o0(parameters, "parameters");
        this.location = location;
        this.parameters = parameters;
        this._isHandled = o0000OO0.OooO00o();
        this.completableDeferred = o0000OO0.OooO00o();
    }

    public static /* synthetic */ Object handle$default(Invocation invocation, Oooo000 oooo000, OooO0OO oooO0OO, int i, Object obj) {
        if ((i & 1) != 0) {
            oooo000 = new C39742(null);
        }
        return invocation.handle(oooo000, oooO0OO);
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }

    public final Object getResult(OooO0OO oooO0OO) throws Throwable {
        Object objOooOo0 = ((o00000O0) this.completableDeferred).OooOo0(oooO0OO);
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOo0;
    }

    public final Object handle(Oooo000 oooo000, OooO0OO oooO0OO) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o00000 o00000Var = this._isHandled;
        OooOo oooOo = OooOo.f33195OooO00o;
        ((o00000O0) o00000Var).Oooo0oO(oooOo);
        o0000OO0.OooOo0(o0000OO0.OooO0O0(oooO0OO.getContext()), null, new C39753(oooo000, this, null), 3);
        return oooOo;
    }

    public final o000O0o isHandled() {
        return this._isHandled;
    }
}
