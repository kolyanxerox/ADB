package androidx.activity;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1 */
    public static final class C00051 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00051(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2 */
    public static final class C00062 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00062(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // o00O0Oo.OooO0O0
        public final CreationExtras invoke() {
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3 */
    public static final class C00073 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00073(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4 */
    public static final class C00084 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ o00O0Oo.OooO0O0 $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00084(o00O0Oo.OooO0O0 oooO0O0, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = oooO0O0;
            this.$this_viewModels = componentActivity;
        }

        @Override // o00O0Oo.OooO0O0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            o00O0Oo.OooO0O0 oooO0O0 = this.$extrasProducer;
            return (oooO0O0 == null || (creationExtras = (CreationExtras) oooO0O0.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static final <VM extends ViewModel> oo00o.OooO0OO viewModels(ComponentActivity componentActivity, o00O0Oo.OooO0O0 oooO0O0) {
        if (oooO0O0 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        OooOo.OooOO0O();
        throw null;
    }

    public static oo00o.OooO0OO viewModels$default(ComponentActivity componentActivity, o00O0Oo.OooO0O0 oooO0O0, int i, Object obj) {
        if ((i & 1) != 0) {
            oooO0O0 = null;
        }
        if (oooO0O0 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        OooOo.OooOO0O();
        throw null;
    }

    public static final <VM extends ViewModel> oo00o.OooO0OO viewModels(ComponentActivity componentActivity, o00O0Oo.OooO0O0 oooO0O0, o00O0Oo.OooO0O0 oooO0O02) {
        if (oooO0O02 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        OooOo.OooOO0O();
        throw null;
    }

    public static oo00o.OooO0OO viewModels$default(ComponentActivity componentActivity, o00O0Oo.OooO0O0 oooO0O0, o00O0Oo.OooO0O0 oooO0O02, int i, Object obj) {
        if ((i & 2) != 0) {
            oooO0O02 = null;
        }
        if (oooO0O02 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        OooOo.OooOO0O();
        throw null;
    }
}
