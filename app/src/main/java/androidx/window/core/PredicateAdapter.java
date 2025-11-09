package androidx.window.core;

import android.util.Pair;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0OO00O;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0o0o.o0ooOOo;
import o00OoO00.OooOOO0;

/* loaded from: classes.dex */
public final class PredicateAdapter {
    private final ClassLoader loader;

    public static abstract class BaseHandler<T> implements InvocationHandler {
        private final o0ooOOo clazz;

        public BaseHandler(o0ooOOo clazz) {
            OooOo.OooO0o0(clazz, "clazz");
            this.clazz = clazz;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            OooOo.OooO0o0(obj, "obj");
            OooOo.OooO0o0(method, "method");
            if (isTest(method, objArr)) {
                o0ooOOo o0ooooo = this.clazz;
                obj2 = objArr != null ? objArr[0] : null;
                OooOOO0.OooO0Oo(o0ooooo, obj2);
                return Boolean.valueOf(invokeTest(obj, obj2));
            }
            if (isEquals(method, objArr)) {
                obj2 = objArr != null ? objArr[0] : null;
                OooOo.OooO0O0(obj2);
                return Boolean.valueOf(obj == obj2);
            }
            if (isHashCode(method, objArr)) {
                return Integer.valueOf(hashCode());
            }
            if (isToString(method, objArr)) {
                return toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }

        public abstract boolean invokeTest(Object obj, T t);

        public final boolean isEquals(Method method, Object[] objArr) {
            OooOo.OooO0o0(method, "<this>");
            return OooOo.OooO00o(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean isHashCode(Method method, Object[] objArr) {
            OooOo.OooO0o0(method, "<this>");
            return OooOo.OooO00o(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        public final boolean isTest(Method method, Object[] objArr) {
            OooOo.OooO0o0(method, "<this>");
            return OooOo.OooO00o(method.getName(), "test") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean isToString(Method method, Object[] objArr) {
            OooOo.OooO0o0(method, "<this>");
            return OooOo.OooO00o(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }
    }

    public static final class PairPredicateStubHandler<T, U> extends BaseHandler<Pair<?, ?>> {
        private final o0ooOOo clazzT;
        private final o0ooOOo clazzU;
        private final o00O0O predicate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PairPredicateStubHandler(o0ooOOo clazzT, o0ooOOo clazzU, o00O0O predicate) {
            super(o0OO00O.OooO00o(Pair.class));
            OooOo.OooO0o0(clazzT, "clazzT");
            OooOo.OooO0o0(clazzU, "clazzU");
            OooOo.OooO0o0(predicate, "predicate");
            this.clazzT = clazzT;
            this.clazzU = clazzU;
            this.predicate = predicate;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public String toString() {
            return this.predicate.toString();
        }

        @Override // androidx.window.core.PredicateAdapter.BaseHandler
        public boolean invokeTest(Object obj, Pair<?, ?> parameter) {
            OooOo.OooO0o0(obj, "obj");
            OooOo.OooO0o0(parameter, "parameter");
            o0ooOOo o0ooooo = this.clazzT;
            Object obj2 = parameter.first;
            OooOOO0.OooO0Oo(o0ooooo, obj2);
            o0ooOOo o0ooooo2 = this.clazzU;
            Object obj3 = parameter.second;
            OooOOO0.OooO0Oo(o0ooooo2, obj3);
            return ((Boolean) this.predicate.invoke(obj2, obj3)).booleanValue();
        }
    }

    public static final class PredicateStubHandler<T> extends BaseHandler<T> {
        private final Oooo000 predicate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PredicateStubHandler(o0ooOOo clazzT, Oooo000 predicate) {
            super(clazzT);
            OooOo.OooO0o0(clazzT, "clazzT");
            OooOo.OooO0o0(predicate, "predicate");
            this.predicate = predicate;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        @Override // androidx.window.core.PredicateAdapter.BaseHandler
        public boolean invokeTest(Object obj, T parameter) {
            OooOo.OooO0o0(obj, "obj");
            OooOo.OooO0o0(parameter, "parameter");
            return ((Boolean) this.predicate.invoke(parameter)).booleanValue();
        }

        public String toString() {
            return this.predicate.toString();
        }
    }

    public PredicateAdapter(ClassLoader loader) {
        OooOo.OooO0o0(loader, "loader");
        this.loader = loader;
    }

    private final Class<?> predicateClassOrThrow() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("java.util.function.Predicate");
        OooOo.OooO0Oo(clsLoadClass, "loader.loadClass(\"java.util.function.Predicate\")");
        return clsLoadClass;
    }

    public final <T, U> Object buildPairPredicate(o0ooOOo firstClazz, o0ooOOo secondClazz, o00O0O predicate) throws IllegalArgumentException {
        OooOo.OooO0o0(firstClazz, "firstClazz");
        OooOo.OooO0o0(secondClazz, "secondClazz");
        OooOo.OooO0o0(predicate, "predicate");
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{predicateClassOrThrow()}, new PairPredicateStubHandler(firstClazz, secondClazz, predicate));
        OooOo.OooO0Oo(objNewProxyInstance, "newProxyInstance(loader,…row()), predicateHandler)");
        return objNewProxyInstance;
    }

    public final <T> Object buildPredicate(o0ooOOo clazz, Oooo000 predicate) throws IllegalArgumentException {
        OooOo.OooO0o0(clazz, "clazz");
        OooOo.OooO0o0(predicate, "predicate");
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{predicateClassOrThrow()}, new PredicateStubHandler(clazz, predicate));
        OooOo.OooO0Oo(objNewProxyInstance, "newProxyInstance(loader,…row()), predicateHandler)");
        return objNewProxyInstance;
    }

    public final Class<?> predicateClassOrNull$window_release() {
        try {
            return predicateClassOrThrow();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
