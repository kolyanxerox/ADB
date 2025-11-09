package androidx.fragment.app;

import android.os.Bundle;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.o00O0O;

/* loaded from: classes.dex */
public final class FragmentKt {
    public static final void clearFragmentResult(Fragment fragment, String requestKey) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResult(requestKey);
    }

    public static final void clearFragmentResultListener(Fragment fragment, String requestKey) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResultListener(requestKey);
    }

    public static final void setFragmentResult(Fragment fragment, String requestKey, Bundle result) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(requestKey, "requestKey");
        OooOo.OooO0o0(result, "result");
        fragment.getParentFragmentManager().setFragmentResult(requestKey, result);
    }

    public static final void setFragmentResultListener(Fragment fragment, String requestKey, final o00O0O listener) {
        OooOo.OooO0o0(fragment, "<this>");
        OooOo.OooO0o0(requestKey, "requestKey");
        OooOo.OooO0o0(listener, "listener");
        fragment.getParentFragmentManager().setFragmentResultListener(requestKey, fragment, new FragmentResultListener() { // from class: androidx.fragment.app.OooOOO0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                FragmentKt.setFragmentResultListener$lambda$0(listener, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFragmentResultListener$lambda$0(o00O0O tmp0, String p0, Bundle p1) {
        OooOo.OooO0o0(tmp0, "$tmp0");
        OooOo.OooO0o0(p0, "p0");
        OooOo.OooO0o0(p1, "p1");
        tmp0.invoke(p0, p1);
    }
}
