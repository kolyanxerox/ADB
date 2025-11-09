package androidx.core.util;

import androidx.core.content.OooO0o;
import java.util.Objects;

/* loaded from: classes.dex */
public interface Predicate<T> {
    static <T> Predicate<T> isEqual(Object obj) {
        return obj == null ? new OooO0o(11) : new OooO0O0(obj, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(Predicate predicate, Object obj) {
        return test(obj) && predicate.test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(Predicate predicate, Object obj) {
        return test(obj) || predicate.test(obj);
    }

    static <T> Predicate<T> not(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    default Predicate<T> and(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new OooO00o(this, predicate, 1);
    }

    default Predicate<T> negate() {
        return new OooO0O0(this, 1);
    }

    /* renamed from: or */
    default Predicate<T> m17or(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new OooO00o(this, predicate, 0);
    }

    boolean test(T t);
}
