package OooO;

import android.app.Activity;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.app.ActivityCompat;
import com.ironsource.C3896z8;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class OooO0O0 implements MethodChannel.MethodCallHandler {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f13247OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0o f13248OooOo0o;

    public OooO0O0(Context context, o000000.OooO oooO, OooO0o oooO0o, o000OOoO.OooO oooO2) {
        this.f13247OooOo0O = context;
        this.f13248OooOo0o = oooO0o;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) throws NumberFormatException {
        Context context;
        OooO0o oooO0o;
        String str = methodCall.method;
        str.getClass();
        context = this.f13247OooOo0O;
        oooO0o = this.f13248OooOo0o;
        switch (str) {
            case "checkServiceStatus":
                int i = Integer.parseInt(methodCall.arguments.toString());
                Objects.requireNonNull(result);
                if (context == null) {
                    Log.d("permissions_handler", "Context cannot be null.");
                    result.error("PermissionHandler.ServiceManager", "Android context cannot be null.", null);
                    break;
                } else if (i != 3 && i != 4 && i != 5) {
                    if (i == 21) {
                        result.success(Integer.valueOf(((BluetoothManager) context.getSystemService(C3896z8.f12932d)).getAdapter().isEnabled() ? 1 : 0));
                        break;
                    } else if (i == 8) {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager.hasSystemFeature("android.hardware.telephony")) {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            if (telephonyManager != null && telephonyManager.getPhoneType() != 0) {
                                if (o000OOoO.OooO.OooO0OO(packageManager).isEmpty()) {
                                    result.success(2);
                                    break;
                                } else if (telephonyManager.getSimState() != 5) {
                                    result.success(0);
                                    break;
                                } else {
                                    result.success(1);
                                    break;
                                }
                            } else {
                                result.success(2);
                                break;
                            }
                        } else {
                            result.success(2);
                            break;
                        }
                    } else if (i == 16) {
                        result.success(1);
                        break;
                    } else {
                        result.success(2);
                        break;
                    }
                } else {
                    result.success(Integer.valueOf(o000OOoO.OooO.OooO0Oo(context) ? 1 : 0));
                    break;
                }
                break;
            case "shouldShowRequestPermissionRationale":
                int i2 = Integer.parseInt(methodCall.arguments.toString());
                Objects.requireNonNull(result);
                Activity activity = oooO0o.f13252OooOo;
                if (activity == null) {
                    Log.d("permissions_handler", "Unable to detect current Activity.");
                    result.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    break;
                } else {
                    ArrayList arrayListOooOOO = OooO00o.OooO00o.OooOOO(activity, i2);
                    if (arrayListOooOOO == null) {
                        Log.d("permissions_handler", "No android specific permissions needed for: " + i2);
                        result.success(Boolean.FALSE);
                        break;
                    } else if (arrayListOooOOO.isEmpty()) {
                        Log.d("permissions_handler", "No permissions found in manifest for: " + i2 + " no need to show request rationale");
                        result.success(Boolean.FALSE);
                        break;
                    } else {
                        result.success(Boolean.valueOf(ActivityCompat.shouldShowRequestPermissionRationale(oooO0o.f13252OooOo, (String) arrayListOooOOO.get(0))));
                        break;
                    }
                }
            case "checkPermissionStatus":
                int i3 = Integer.parseInt(methodCall.arguments.toString());
                Objects.requireNonNull(result);
                result.success(Integer.valueOf(oooO0o.OooO00o(i3)));
                break;
            case "openAppSettings":
                Objects.requireNonNull(result);
                if (context == null) {
                    Log.d("permissions_handler", "Context cannot be null.");
                    result.error("PermissionHandler.AppSettingsManager", "Android context cannot be null.", null);
                    break;
                } else {
                    try {
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.setData(Uri.parse("package:" + context.getPackageName()));
                        intent.addFlags(268435456);
                        intent.addFlags(BasicMeasure.EXACTLY);
                        intent.addFlags(8388608);
                        context.startActivity(intent);
                        result.success(Boolean.TRUE);
                        break;
                    } catch (Exception unused) {
                        result.success(Boolean.FALSE);
                        return;
                    }
                }
            case "requestPermissions":
                List<Integer> list = (List) methodCall.arguments();
                Objects.requireNonNull(result);
                OooO00o oooO00o = new OooO00o(result);
                if (oooO0o.f13256OooOoO0 > 0) {
                    result.error("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", null);
                    break;
                } else if (oooO0o.f13252OooOo == null) {
                    Log.d("permissions_handler", "Unable to detect current Activity.");
                    result.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    break;
                } else {
                    oooO0o.f13254OooOo0o = oooO00o;
                    oooO0o.f13255OooOoO = new HashMap();
                    oooO0o.f13256OooOoO0 = 0;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : list) {
                        if (oooO0o.OooO00o(num.intValue()) != 1) {
                            ArrayList arrayListOooOOO2 = OooO00o.OooO00o.OooOOO(oooO0o.f13252OooOo, num.intValue());
                            if (arrayListOooOOO2 != null && !arrayListOooOOO2.isEmpty()) {
                                int i4 = Build.VERSION.SDK_INT;
                                if (num.intValue() == 16) {
                                    oooO0o.OooO0OO(209, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                } else if (i4 >= 30 && num.intValue() == 22) {
                                    oooO0o.OooO0OO(210, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                                } else if (num.intValue() == 23) {
                                    oooO0o.OooO0OO(211, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                } else if (i4 >= 26 && num.intValue() == 24) {
                                    oooO0o.OooO0OO(212, "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                                } else if (num.intValue() == 27) {
                                    oooO0o.OooO0OO(213, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                                } else if (i4 >= 31 && num.intValue() == 34) {
                                    oooO0o.OooO0OO(214, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                                } else if (num.intValue() != 37 && num.intValue() != 0) {
                                    arrayList.addAll(arrayListOooOOO2);
                                    oooO0o.f13256OooOoO0 = arrayListOooOOO2.size() + oooO0o.f13256OooOoO0;
                                } else if (oooO0o.OooO0O0()) {
                                    arrayList.add("android.permission.WRITE_CALENDAR");
                                    arrayList.add("android.permission.READ_CALENDAR");
                                    oooO0o.f13256OooOoO0 += 2;
                                } else {
                                    oooO0o.f13255OooOoO.put(num, 0);
                                }
                            } else if (!oooO0o.f13255OooOoO.containsKey(num)) {
                                oooO0o.f13255OooOoO.put(num, 0);
                                if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                    oooO0o.f13255OooOoO.put(num, 0);
                                } else {
                                    oooO0o.f13255OooOoO.put(num, 2);
                                }
                            }
                        } else if (!oooO0o.f13255OooOoO.containsKey(num)) {
                            oooO0o.f13255OooOoO.put(num, 1);
                        }
                    }
                    if (arrayList.size() > 0) {
                        ActivityCompat.requestPermissions(oooO0o.f13252OooOo, (String[]) arrayList.toArray(new String[0]), 24);
                    }
                    OooO00o oooO00o2 = oooO0o.f13254OooOo0o;
                    if (oooO00o2 != null && oooO0o.f13256OooOoO0 == 0) {
                        oooO00o2.f13246OooOo0O.success(oooO0o.f13255OooOoO);
                        break;
                    }
                }
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
