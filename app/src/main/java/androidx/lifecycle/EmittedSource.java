package androidx.lifecycle;

import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00O0oOo.o000OO00;
import o00OO000.Oooo0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class EmittedSource implements o000OO00 {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.EmittedSource$dispose$1", m13472f = "CoroutineLiveData.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.EmittedSource$dispose$1 */
    public static final class C05441 extends OooOOOO implements o00O0O {
        int label;

        public C05441(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return EmittedSource.this.new C05441(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            EmittedSource.this.removeSource();
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05441) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @o00O0OO0.OooO(m13471c = "androidx.lifecycle.EmittedSource$disposeNow$2", m13472f = "CoroutineLiveData.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.EmittedSource$disposeNow$2 */
    public static final class C05452 extends OooOOOO implements o00O0O {
        int label;

        public C05452(o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return EmittedSource.this.new C05452(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            EmittedSource.this.removeSource();
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C05452) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public EmittedSource(LiveData<?> source, MediatorLiveData<?> mediator) {
        kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
        kotlin.jvm.internal.OooOo.OooO0o0(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    public final void removeSource() {
        if (this.disposed) {
            return;
        }
        this.mediator.removeSource(this.source);
        this.disposed = true;
    }

    @Override // o00O0oOo.o000OO00
    public void dispose() {
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o0000OO0.OooOo0(o0000OO0.OooO0O0(Oooo0.f31951OooO00o.f31652OooOo), null, new C05441(null), 3);
    }

    public final Object disposeNow(o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        Object objOooo00O = o0000OO0.Oooo00O(new C05452(null), Oooo0.f31951OooO00o.f31652OooOo, oooO0OO);
        return objOooo00O == OooOo00.f31365OooOo0O ? objOooo00O : OooOo.f33195OooO00o;
    }
}
