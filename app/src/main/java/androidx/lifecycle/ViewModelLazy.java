package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0o0o.o0ooOOo;

/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements oo00o.OooO0OO {
    private VM cached;
    private final o00O0Oo.OooO0O0 extrasProducer;
    private final o00O0Oo.OooO0O0 factoryProducer;
    private final o00O0Oo.OooO0O0 storeProducer;
    private final o0ooOOo viewModelClass;

    /* renamed from: androidx.lifecycle.ViewModelLazy$1 */
    public static final class C05661 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public static final C05661 INSTANCE = new C05661();

        public C05661() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(o0ooOOo viewModelClass, o00O0Oo.OooO0O0 storeProducer, o00O0Oo.OooO0O0 factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        OooOo.OooO0o0(viewModelClass, "viewModelClass");
        OooOo.OooO0o0(storeProducer, "storeProducer");
        OooOo.OooO0o0(factoryProducer, "factoryProducer");
    }

    @Override // oo00o.OooO0OO
    public boolean isInitialized() {
        return this.cached != null;
    }

    public ViewModelLazy(o0ooOOo viewModelClass, o00O0Oo.OooO0O0 storeProducer, o00O0Oo.OooO0O0 factoryProducer, o00O0Oo.OooO0O0 extrasProducer) {
        OooOo.OooO0o0(viewModelClass, "viewModelClass");
        OooOo.OooO0o0(storeProducer, "storeProducer");
        OooOo.OooO0o0(factoryProducer, "factoryProducer");
        OooOo.OooO0o0(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // oo00o.OooO0OO
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) ViewModelProvider.Companion.create((ViewModelStore) this.storeProducer.invoke(), (ViewModelProvider.Factory) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(o0ooOOo o0ooooo, o00O0Oo.OooO0O0 oooO0O0, o00O0Oo.OooO0O0 oooO0O02, o00O0Oo.OooO0O0 oooO0O03, int i, OooOO0O oooOO0O) {
        this(o0ooooo, oooO0O0, oooO0O02, (i & 8) != 0 ? C05661.INSTANCE : oooO0O03);
    }
}
