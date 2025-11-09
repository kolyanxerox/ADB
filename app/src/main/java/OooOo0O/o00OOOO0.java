package oOooo0o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o00OOO0O.OooO0OO;

/* loaded from: classes3.dex */
public final class o00OOOO0 implements InvocationHandler {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f33165OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f33166OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f33167OooO0OO;

    public o00OOOO0(ArrayList arrayList) {
        this.f33165OooO00o = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = OooO0OO.f32336OooO0O0;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f33166OooO0O0 = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.f33165OooO00o;
        if (zEquals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.contains(list.get(i))) {
                        String str = (String) list.get(i);
                        this.f33167OooO0OO = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f33167OooO0OO = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f33167OooO0OO = (String) objArr[0];
        return null;
    }
}
