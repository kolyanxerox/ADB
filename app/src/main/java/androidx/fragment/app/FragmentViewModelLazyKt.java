package androidx.fragment.app;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.internal.measurement.o0OOO0;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0o0o.o0ooOOo;

/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt {

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1 */
    public static final class C05191 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05191(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            OooOo.OooO0Oo(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2 */
    public static final class C05202 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05202(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            OooOo.OooO0Oo(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3 */
    public static final class C05213 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05213(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            OooOo.OooO0Oo(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4 */
    public static final class C05224 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05224(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            OooOo.OooO0Oo(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5 */
    public static final class C05235 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ o00O0Oo.OooO0O0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05235(o00O0Oo.OooO0O0 oooO0O0, Fragment fragment) {
            super(0);
            this.$extrasProducer = oooO0O0;
            this.$this_activityViewModels = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            o00O0Oo.OooO0O0 oooO0O0 = this.$extrasProducer;
            if (oooO0O0 != null && (creationExtras = (CreationExtras) oooO0O0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            OooOo.OooO0Oo(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6 */
    public static final class C05246 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05246(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            OooOo.OooO0Oo(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$1 */
    public static final class C05251 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Fragment $this_createViewModelLazy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05251(Fragment fragment) {
            super(0);
            this.$this_createViewModelLazy = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras = this.$this_createViewModelLazy.getDefaultViewModelCreationExtras();
            OooOo.OooO0Oo(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$2 */
    public static final class C05262 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Fragment $this_createViewModelLazy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05262(Fragment fragment) {
            super(0);
            this.$this_createViewModelLazy = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras = this.$this_createViewModelLazy.getDefaultViewModelCreationExtras();
            OooOo.OooO0Oo(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$1 */
    public static final class C05271 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05271(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2 */
    public static final class C05282 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ oo00o.OooO0OO $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05282(oo00o.OooO0OO oooO0OO) {
            super(0);
            this.$owner$delegate = oooO0OO;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m13523viewModels$lambda0(this.$owner$delegate).getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3 */
    public static final class C05293 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ oo00o.OooO0OO $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05293(oo00o.OooO0OO oooO0OO) {
            super(0);
            this.$owner$delegate = oooO0OO;
        }

        @Override // o00O0Oo.OooO0O0
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwnerM13523viewModels$lambda0 = FragmentViewModelLazyKt.m13523viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13523viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13523viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras()) == null) ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4 */
    public static final class C05304 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ oo00o.OooO0OO $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05304(Fragment fragment, oo00o.OooO0OO oooO0OO) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = oooO0OO;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM13523viewModels$lambda0 = FragmentViewModelLazyKt.m13523viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13523viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13523viewModels$lambda0 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            OooOo.OooO0Oo(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$5 */
    public static final class C05315 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05315(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        @Override // o00O0Oo.OooO0O0
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6 */
    public static final class C05326 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ oo00o.OooO0OO $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05326(oo00o.OooO0OO oooO0OO) {
            super(0);
            this.$owner$delegate = oooO0OO;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m13524viewModels$lambda1(this.$owner$delegate).getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7 */
    public static final class C05337 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ o00O0Oo.OooO0O0 $extrasProducer;
        final /* synthetic */ oo00o.OooO0OO $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05337(o00O0Oo.OooO0O0 oooO0O0, oo00o.OooO0OO oooO0OO) {
            super(0);
            this.$extrasProducer = oooO0O0;
            this.$owner$delegate = oooO0OO;
        }

        @Override // o00O0Oo.OooO0O0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            o00O0Oo.OooO0O0 oooO0O0 = this.$extrasProducer;
            if (oooO0O0 != null && (creationExtras = (CreationExtras) oooO0O0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerM13524viewModels$lambda1 = FragmentViewModelLazyKt.m13524viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13524viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13524viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8 */
    public static final class C05348 extends Oooo000 implements o00O0Oo.OooO0O0 {
        final /* synthetic */ oo00o.OooO0OO $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05348(Fragment fragment, oo00o.OooO0OO oooO0OO) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = oooO0OO;
        }

        @Override // o00O0Oo.OooO0O0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM13524viewModels$lambda1 = FragmentViewModelLazyKt.m13524viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13524viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13524viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            OooOo.OooO0Oo(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    public static final <VM extends ViewModel> oo00o.OooO0OO activityViewModels(Fragment fragment, o00O0Oo.OooO0O0 oooO0O0) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooOO0O();
        throw null;
    }

    public static oo00o.OooO0OO activityViewModels$default(Fragment fragment, o00O0Oo.OooO0O0 oooO0O0, int i, Object obj) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooOO0O();
        throw null;
    }

    public static final /* synthetic */ oo00o.OooO0OO createViewModelLazy(Fragment fragment, o0ooOOo viewModelClass, o00O0Oo.OooO0O0 storeProducer, o00O0Oo.OooO0O0 oooO0O0) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(viewModelClass, "viewModelClass");
        OooOo.OooO0o0(storeProducer, "storeProducer");
        return createViewModelLazy(fragment, viewModelClass, storeProducer, new C05251(fragment), oooO0O0);
    }

    public static /* synthetic */ oo00o.OooO0OO createViewModelLazy$default(Fragment fragment, o0ooOOo o0ooooo, o00O0Oo.OooO0O0 oooO0O0, o00O0Oo.OooO0O0 oooO0O02, int i, Object obj) {
        if ((i & 4) != 0) {
            oooO0O02 = null;
        }
        return createViewModelLazy(fragment, o0ooooo, oooO0O0, oooO0O02);
    }

    public static final <VM extends ViewModel> oo00o.OooO0OO viewModels(Fragment fragment, o00O0Oo.OooO0O0 ownerProducer, o00O0Oo.OooO0O0 oooO0O0) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(ownerProducer, "ownerProducer");
        o0OOO0.OooO0oO(oo00o.OooO0o.f33184OooOo0o, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        OooOo.OooOO0O();
        throw null;
    }

    public static oo00o.OooO0OO viewModels$default(Fragment fragment, o00O0Oo.OooO0O0 ownerProducer, o00O0Oo.OooO0O0 oooO0O0, int i, Object obj) {
        if ((i & 1) != 0) {
            ownerProducer = new C05271(fragment);
        }
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(ownerProducer, "ownerProducer");
        o0OOO0.OooO0oO(oo00o.OooO0o.f33184OooOo0o, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        OooOo.OooOO0O();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m13523viewModels$lambda0(oo00o.OooO0OO oooO0OO) {
        return (ViewModelStoreOwner) oooO0OO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m13524viewModels$lambda1(oo00o.OooO0OO oooO0OO) {
        return (ViewModelStoreOwner) oooO0OO.getValue();
    }

    public static final <VM extends ViewModel> oo00o.OooO0OO activityViewModels(Fragment fragment, o00O0Oo.OooO0O0 oooO0O0, o00O0Oo.OooO0O0 oooO0O02) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooOO0O();
        throw null;
    }

    public static final <VM extends ViewModel> oo00o.OooO0OO createViewModelLazy(Fragment fragment, o0ooOOo viewModelClass, o00O0Oo.OooO0O0 storeProducer, o00O0Oo.OooO0O0 extrasProducer, o00O0Oo.OooO0O0 oooO0O0) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(viewModelClass, "viewModelClass");
        OooOo.OooO0o0(storeProducer, "storeProducer");
        OooOo.OooO0o0(extrasProducer, "extrasProducer");
        if (oooO0O0 == null) {
            oooO0O0 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(viewModelClass, storeProducer, oooO0O0, extrasProducer);
    }

    public static /* synthetic */ oo00o.OooO0OO createViewModelLazy$default(Fragment fragment, o0ooOOo o0ooooo, o00O0Oo.OooO0O0 oooO0O0, o00O0Oo.OooO0O0 oooO0O02, o00O0Oo.OooO0O0 oooO0O03, int i, Object obj) {
        if ((i & 4) != 0) {
            oooO0O02 = new C05262(fragment);
        }
        if ((i & 8) != 0) {
            oooO0O03 = null;
        }
        return createViewModelLazy(fragment, o0ooooo, oooO0O0, oooO0O02, oooO0O03);
    }

    public static oo00o.OooO0OO activityViewModels$default(Fragment fragment, o00O0Oo.OooO0O0 oooO0O0, o00O0Oo.OooO0O0 oooO0O02, int i, Object obj) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooOO0O();
        throw null;
    }

    public static final <VM extends ViewModel> oo00o.OooO0OO viewModels(Fragment fragment, o00O0Oo.OooO0O0 ownerProducer, o00O0Oo.OooO0O0 oooO0O0, o00O0Oo.OooO0O0 oooO0O02) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(ownerProducer, "ownerProducer");
        o0OOO0.OooO0oO(oo00o.OooO0o.f33184OooOo0o, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        OooOo.OooOO0O();
        throw null;
    }

    public static oo00o.OooO0OO viewModels$default(Fragment fragment, o00O0Oo.OooO0O0 ownerProducer, o00O0Oo.OooO0O0 oooO0O0, o00O0Oo.OooO0O0 oooO0O02, int i, Object obj) {
        if ((i & 1) != 0) {
            ownerProducer = new C05315(fragment);
        }
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(ownerProducer, "ownerProducer");
        o0OOO0.OooO0oO(oo00o.OooO0o.f33184OooOo0o, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        OooOo.OooOO0O();
        throw null;
    }
}
