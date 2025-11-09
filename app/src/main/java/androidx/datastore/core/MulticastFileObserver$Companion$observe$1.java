package androidx.datastore.core;

import androidx.datastore.core.MulticastFileObserver;
import java.io.File;
import kotlin.jvm.internal.Oooo000;
import o000O00.o00O0O0O;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO00;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import oo00o.OooOo;

@OooO(m13471c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", m13472f = "MulticastFileObserver.android.kt", m13473l = {84, 85}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MulticastFileObserver$Companion$observe$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* renamed from: androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1 */
    public static final class C03191 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ o000OO00 $disposeListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03191(o000OO00 o000oo002) {
            super(0);
            this.$disposeListener = o000oo002;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13514invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13514invoke() {
            this.$disposeListener.dispose();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$file = file;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, oooO0OO);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o000OO00 o000oo00Observe;
        o00oOoo o00oooo;
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        OooOo oooOo = OooOo.f33195OooO00o;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            o00oOoo o00oooo2 = (o00oOoo) this.L$0;
            MulticastFileObserver$Companion$observe$1$flowObserver$1 multicastFileObserver$Companion$observe$1$flowObserver$1 = new MulticastFileObserver$Companion$observe$1$flowObserver$1(this.$file, o00oooo2);
            MulticastFileObserver.Companion companion = MulticastFileObserver.Companion;
            File parentFile = this.$file.getParentFile();
            kotlin.jvm.internal.OooOo.OooO0O0(parentFile);
            o000oo00Observe = companion.observe(parentFile, multicastFileObserver$Companion$observe$1$flowObserver$1);
            this.L$0 = o00oooo2;
            this.L$1 = o000oo00Observe;
            this.label = 1;
            if (((o0O0ooO) o00oooo2).f31651OooOoO0.OooOOO0(oooOo, this) != oooOo00) {
                o00oooo = o00oooo2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return oooOo;
        }
        o000oo00Observe = (o000OO00) this.L$1;
        o00oooo = (o00oOoo) this.L$0;
        o000OOo.OooOO0O(obj);
        C03191 c03191 = new C03191(o000oo00Observe);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        return o00O0O0O.OooO00o(o00oooo, c03191, this) == oooOo00 ? oooOo00 : oooOo;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o00oOoo o00oooo, OooO0OO oooO0OO) {
        return ((MulticastFileObserver$Companion$observe$1) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
