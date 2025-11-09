package androidx.lifecycle;

import android.app.Application;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import o00O0.OooOOO;
import o00O0.OooOo;

/* loaded from: classes.dex */
public final class SavedStateViewModelFactoryKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = OooOo.OooOOo(Application.class, SavedStateHandle.class);
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = o0OO0O0.OooOO0o(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) throws SecurityException {
        kotlin.jvm.internal.OooOo.OooO0o0(modelClass, "modelClass");
        kotlin.jvm.internal.OooOo.OooO0o0(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.OooOo.OooO0Oo(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.OooOo.OooO0Oo(parameterTypes, "constructor.parameterTypes");
            List listOoooOOo = OooOOO.OoooOOo(parameterTypes);
            if (signature.equals(listOoooOOo)) {
                return constructor;
            }
            if (signature.size() == listOoooOOo.size() && listOoooOOo.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        kotlin.jvm.internal.OooOo.OooO0o0(modelClass, "modelClass");
        kotlin.jvm.internal.OooOo.OooO0o0(constructor, "constructor");
        kotlin.jvm.internal.OooOo.OooO0o0(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + modelClass, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e3.getCause());
        }
    }
}
