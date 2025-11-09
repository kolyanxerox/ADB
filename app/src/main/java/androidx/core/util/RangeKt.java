package androidx.core.util;

import android.util.Range;
import kotlin.jvm.internal.OooOo;
import o00O0o0O.o0OoOo0;

/* loaded from: classes.dex */
public final class RangeKt {
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        return range.extend((Range<T>) t);
    }

    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        return new Range<>(t, t2);
    }

    public static final <T extends Comparable<? super T>> o0OoOo0 toClosedRange(final Range<T> range) {
        return new o0OoOo0() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable value) {
                OooOo.OooO0o0(value, "value");
                return value.compareTo(getStart()) >= 0 && value.compareTo(getEndInclusive()) <= 0;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // o00O0o0O.o0OoOo0
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // o00O0o0O.o0OoOo0
            public Comparable getStart() {
                return range.getLower();
            }

            public boolean isEmpty() {
                return getStart().compareTo(getEndInclusive()) > 0;
            }
        };
    }

    public static final <T extends Comparable<? super T>> Range<T> toRange(o0OoOo0 o0oooo0) {
        return new Range<>(o0oooo0.getStart(), o0oooo0.getEndInclusive());
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }
}
