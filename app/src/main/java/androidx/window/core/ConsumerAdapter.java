package androidx.window.core;

import android.app.Activity;
import android.content.Context;
import androidx.window.reflection.WindowExtensionsConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;
import o00O0o0o.o0ooOOo;
import o00OoO00.OooOOO0;

/* loaded from: classes.dex */
public final class ConsumerAdapter {
    private final ClassLoader loader;

    public static final class ConsumerHandler<T> implements InvocationHandler {
        private final o0ooOOo clazz;
        private final Oooo000 consumer;

        public ConsumerHandler(o0ooOOo clazz, Oooo000 consumer) {
            OooOo.OooO0o0(clazz, "clazz");
            OooOo.OooO0o0(consumer, "consumer");
            this.clazz = clazz;
            this.consumer = consumer;
        }

        private final boolean isAccept(Method method, Object[] objArr) {
            return OooOo.OooO00o(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        private final boolean isEquals(Method method, Object[] objArr) {
            return OooOo.OooO00o(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        private final boolean isHashCode(Method method, Object[] objArr) {
            return OooOo.OooO00o(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean isToString(Method method, Object[] objArr) {
            return OooOo.OooO00o(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            OooOo.OooO0o0(obj, "obj");
            OooOo.OooO0o0(method, "method");
            if (isAccept(method, objArr)) {
                o0ooOOo o0ooooo = this.clazz;
                Object obj2 = objArr != null ? objArr[0] : null;
                OooOOO0.OooO0Oo(o0ooooo, obj2);
                invokeAccept(obj2);
                return oo00o.OooOo.f33195OooO00o;
            }
            if (isEquals(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (isHashCode(method, objArr)) {
                return Integer.valueOf(this.consumer.hashCode());
            }
            if (isToString(method, objArr)) {
                return this.consumer.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }

        public final void invokeAccept(T parameter) {
            OooOo.OooO0o0(parameter, "parameter");
            this.consumer.invoke(parameter);
        }
    }

    public interface Subscription {
        void dispose();
    }

    public ConsumerAdapter(ClassLoader loader) {
        OooOo.OooO0o0(loader, "loader");
        this.loader = loader;
    }

    private final <T> Object buildConsumer(o0ooOOo o0ooooo, Oooo000 oooo000) throws IllegalArgumentException {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{unsafeConsumerClass()}, new ConsumerHandler(o0ooooo, oooo000));
        OooOo.OooO0Oo(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return objNewProxyInstance;
    }

    private final Class<?> unsafeConsumerClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.JAVA_CONSUMER);
        OooOo.OooO0Oo(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }

    public final <T> void addConsumer(Object obj, o0ooOOo clazz, String methodName, Oooo000 consumer) {
        OooOo.OooO0o0(obj, "obj");
        OooOo.OooO0o0(clazz, "clazz");
        OooOo.OooO0o0(methodName, "methodName");
        OooOo.OooO0o0(consumer, "consumer");
        obj.getClass().getMethod(methodName, unsafeConsumerClass()).invoke(obj, buildConsumer(clazz, consumer));
    }

    public final Class<?> consumerClassOrNull$window_release() {
        try {
            return unsafeConsumerClass();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <T> void createConsumer(Object obj, o0ooOOo clazz, String addMethodName, Activity activity, Oooo000 consumer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        OooOo.OooO0o0(obj, "obj");
        OooOo.OooO0o0(clazz, "clazz");
        OooOo.OooO0o0(addMethodName, "addMethodName");
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(consumer, "consumer");
        obj.getClass().getMethod(addMethodName, Activity.class, unsafeConsumerClass()).invoke(obj, activity, buildConsumer(clazz, consumer));
    }

    public final <T> Subscription createSubscription(final Object obj, o0ooOOo clazz, String addMethodName, String removeMethodName, Activity activity, Oooo000 consumer) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo.OooO0o0(obj, "obj");
        OooOo.OooO0o0(clazz, "clazz");
        OooOo.OooO0o0(addMethodName, "addMethodName");
        OooOo.OooO0o0(removeMethodName, "removeMethodName");
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(consumer, "consumer");
        final Object objBuildConsumer = buildConsumer(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Activity.class, unsafeConsumerClass()).invoke(obj, activity, objBuildConsumer);
        final Method method = obj.getClass().getMethod(removeMethodName, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscription.1
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                method.invoke(obj, objBuildConsumer);
            }
        };
    }

    public final <T> Subscription createSubscriptionNoActivity(final Object obj, o0ooOOo clazz, String addMethodName, String removeMethodName, Oooo000 consumer) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo.OooO0o0(obj, "obj");
        OooOo.OooO0o0(clazz, "clazz");
        OooOo.OooO0o0(addMethodName, "addMethodName");
        OooOo.OooO0o0(removeMethodName, "removeMethodName");
        OooOo.OooO0o0(consumer, "consumer");
        final Object objBuildConsumer = buildConsumer(clazz, consumer);
        obj.getClass().getMethod(addMethodName, unsafeConsumerClass()).invoke(obj, objBuildConsumer);
        final Method method = obj.getClass().getMethod(removeMethodName, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscriptionNoActivity.1
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                method.invoke(obj, objBuildConsumer);
            }
        };
    }

    public final <T> Subscription createSubscription(final Object obj, o0ooOOo clazz, String addMethodName, String removeMethodName, Context context, Oooo000 consumer) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo.OooO0o0(obj, "obj");
        OooOo.OooO0o0(clazz, "clazz");
        OooOo.OooO0o0(addMethodName, "addMethodName");
        OooOo.OooO0o0(removeMethodName, "removeMethodName");
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(consumer, "consumer");
        final Object objBuildConsumer = buildConsumer(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Context.class, unsafeConsumerClass()).invoke(obj, context, objBuildConsumer);
        final Method method = obj.getClass().getMethod(removeMethodName, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscription.2
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                method.invoke(obj, objBuildConsumer);
            }
        };
    }
}
