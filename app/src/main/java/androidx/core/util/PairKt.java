package androidx.core.util;

import oo00o.OooOO0;

/* loaded from: classes.dex */
public final class PairKt {
    public static final <F, S> F component1(Pair<F, S> pair) {
        return pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        return pair.second;
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(OooOO0 oooOO0) {
        return new android.util.Pair<>(oooOO0.f33185OooOo0O, oooOO0.f33186OooOo0o);
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(OooOO0 oooOO0) {
        return new Pair<>(oooOO0.f33185OooOo0O, oooOO0.f33186OooOo0o);
    }

    public static final <F, S> OooOO0 toKotlinPair(Pair<F, S> pair) {
        return new OooOO0(pair.first, pair.second);
    }

    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        return (F) pair.first;
    }

    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        return (S) pair.second;
    }

    public static final <F, S> OooOO0 toKotlinPair(android.util.Pair<F, S> pair) {
        return new OooOO0(pair.first, pair.second);
    }
}
