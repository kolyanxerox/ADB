package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE = create();

    /* renamed from: com.google.gson.internal.UnsafeAllocator$1 */
    public class C24141 extends UnsafeAllocator {
        final /* synthetic */ Method val$allocateInstance;
        final /* synthetic */ Object val$unsafe;

        public C24141(Method method, Object obj) {
            method = method;
            obj = obj;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) throws Exception {
            UnsafeAllocator.assertInstantiable(cls);
            return (T) method.invoke(obj, cls);
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$2 */
    public class C24152 extends UnsafeAllocator {
        final /* synthetic */ int val$constructorId;
        final /* synthetic */ Method val$newInstance;

        public C24152(Method method, int i) {
            method = method;
            i = i;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) throws Exception {
            UnsafeAllocator.assertInstantiable(cls);
            return (T) method.invoke(null, cls, Integer.valueOf(i));
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$3 */
    public class C24163 extends UnsafeAllocator {
        final /* synthetic */ Method val$newInstance;

        public C24163(Method method) {
            method = method;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) throws Exception {
            UnsafeAllocator.assertInstantiable(cls);
            return (T) method.invoke(null, cls, Object.class);
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$4 */
    public class C24174 extends UnsafeAllocator {
        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static void assertInstantiable(Class<?> cls) {
        String strCheckInstantiable = ConstructorConstructor.checkInstantiable(cls);
        if (strCheckInstantiable != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strCheckInstantiable));
        }
    }

    private static UnsafeAllocator create() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.1
                        final /* synthetic */ Method val$allocateInstance;
                        final /* synthetic */ Object val$unsafe;

                        public C24141(Method method, Object obj) {
                            method = method;
                            obj = obj;
                        }

                        @Override // com.google.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) throws Exception {
                            UnsafeAllocator.assertInstantiable(cls2);
                            return (T) method.invoke(obj, cls2);
                        }
                    };
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.2
                        final /* synthetic */ int val$constructorId;
                        final /* synthetic */ Method val$newInstance;

                        public C24152(Method declaredMethod22, int iIntValue2) {
                            method = declaredMethod22;
                            i = iIntValue2;
                        }

                        @Override // com.google.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) throws Exception {
                            UnsafeAllocator.assertInstantiable(cls2);
                            return (T) method.invoke(null, cls2, Integer.valueOf(i));
                        }
                    };
                }
            } catch (Exception unused2) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.3
                    final /* synthetic */ Method val$newInstance;

                    public C24163(Method declaredMethod32) {
                        method = declaredMethod32;
                    }

                    @Override // com.google.gson.internal.UnsafeAllocator
                    public <T> T newInstance(Class<T> cls2) throws Exception {
                        UnsafeAllocator.assertInstantiable(cls2);
                        return (T) method.invoke(null, cls2, Object.class);
                    }
                };
            }
        } catch (Exception unused3) {
            return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.4
                @Override // com.google.gson.internal.UnsafeAllocator
                public <T> T newInstance(Class<T> cls2) {
                    throw new UnsupportedOperationException("Cannot allocate " + cls2 + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                }
            };
        }
    }

    public abstract <T> T newInstance(Class<T> cls) throws Exception;
}
