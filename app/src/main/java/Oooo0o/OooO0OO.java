package Oooo0o;

import OooO0oO.OooOo;
import Oooo00O.o000000O;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class OooO0OO extends OoooO0.OooO implements OooO0O0 {

    /* renamed from: OooOo0o */
    public final Object f13858OooOo0o;

    public OooO0OO(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 0);
        this.f13858OooOo0o = obj;
    }

    public static OooO0O0 o000O0o0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof OooO0O0 ? (OooO0O0) iInterfaceQueryLocalInterface : new OooOO0(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 0);
    }

    public static Object o000O0oO(OooO0O0 oooO0O0) throws SecurityException {
        if (oooO0O0 instanceof OooO0OO) {
            return ((OooO0OO) oooO0O0).f13858OooOo0o;
        }
        IBinder iBinderAsBinder = oooO0O0.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(OooOo.OooO0o(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        o000000O.OooO0oo(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
