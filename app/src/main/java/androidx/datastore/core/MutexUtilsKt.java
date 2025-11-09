package androidx.datastore.core;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;
import o00OO0O0.OooO0o;

/* loaded from: classes.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(o00OO0O0.OooO00o oooO00o, Object obj, Oooo000 block) {
        OooOo.OooO0o0(oooO00o, "<this>");
        OooOo.OooO0o0(block, "block");
        OooO0o oooO0o = (OooO0o) oooO00o;
        boolean zOooO0o0 = oooO0o.OooO0o0(obj);
        try {
            return (R) block.invoke(Boolean.valueOf(zOooO0o0));
        } finally {
            if (zOooO0o0) {
                oooO0o.OooO0o(obj);
            }
        }
    }

    public static /* synthetic */ Object withTryLock$default(o00OO0O0.OooO00o oooO00o, Object obj, Oooo000 block, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        OooOo.OooO0o0(oooO00o, "<this>");
        OooOo.OooO0o0(block, "block");
        OooO0o oooO0o = (OooO0o) oooO00o;
        boolean zOooO0o0 = oooO0o.OooO0o0(obj);
        try {
            return block.invoke(Boolean.valueOf(zOooO0o0));
        } finally {
            if (zOooO0o0) {
                oooO0o.OooO0o(obj);
            }
        }
    }
}
