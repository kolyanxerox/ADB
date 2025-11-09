package org.apache.tika.utils;

import OooO0oO.OooOo;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o0oOO.OooO0o;
import org.apache.tika.config.Field;
import org.apache.tika.config.Param;
import org.apache.tika.config.ParamField;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.exception.TikaConfigException;

/* loaded from: classes3.dex */
public class AnnotationUtils {
    private static final o0oOO.OooO0O0 LOG = OooO0o.OooO0O0(AnnotationUtils.class);
    private static final Map<Class<?>, List<ParamField>> PARAM_INFO = new HashMap();

    public static void assignFieldParams(Object obj, Map<String, Param> map) throws TikaConfigException {
        Class<?> cls = obj.getClass();
        Map<Class<?>, List<ParamField>> map2 = PARAM_INFO;
        if (!map2.containsKey(cls)) {
            synchronized (TikaConfig.class) {
                try {
                    if (!map2.containsKey(cls)) {
                        List<AccessibleObject> listCollectInfo = collectInfo(cls, Field.class);
                        ArrayList arrayList = new ArrayList(listCollectInfo.size());
                        Iterator<AccessibleObject> it = listCollectInfo.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ParamField(it.next()));
                        }
                        PARAM_INFO.put(cls, arrayList);
                    }
                } finally {
                }
            }
        }
        for (ParamField paramField : PARAM_INFO.get(cls)) {
            Param param = map.get(paramField.getName());
            if (param != null) {
                if (!paramField.getType().isAssignableFrom(param.getType())) {
                    throw new TikaConfigException(String.format(Locale.ROOT, "Value '%s' of type '%s' can't be assigned to field '%s' of defined type '%s'", param.getValue(), param.getValue().getClass(), paramField.getName(), paramField.getType()));
                }
                try {
                    paramField.assignValue(obj, param.getValue());
                } catch (IllegalAccessException e) {
                    LOG.OooOO0(param.getValue(), param.getName());
                    throw new TikaConfigException(e.getMessage(), e);
                } catch (InvocationTargetException e2) {
                    LOG.OooOO0(param.getValue(), param.getName());
                    Throwable cause = e2.getCause();
                    Throwable cause2 = e2;
                    if (cause != null) {
                        cause2 = e2.getCause();
                    }
                    throw new TikaConfigException(cause2.getMessage(), cause2);
                }
            } else {
                if (paramField.isRequired()) {
                    Locale locale = Locale.ROOT;
                    throw new TikaConfigException(OooOo.OooOO0o("Param ", paramField.getName(), " is required for ", obj.getClass().getName(), ", but it is not given in config."));
                }
                LOG.OooOOo0("Param not supplied, field is not mandatory");
            }
        }
    }

    private static List<AccessibleObject> collectInfo(Class<?> cls, Class<? extends Annotation> cls2) throws SecurityException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (cls != null && cls != Object.class) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            arrayList.addAll(Arrays.asList(cls.getDeclaredMethods()));
            cls = cls.getSuperclass();
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AccessibleObject accessibleObject = (AccessibleObject) obj;
            if (accessibleObject.isAnnotationPresent(cls2)) {
                accessibleObject.setAccessible(true);
                arrayList2.add(accessibleObject);
            }
        }
        return arrayList2;
    }
}
