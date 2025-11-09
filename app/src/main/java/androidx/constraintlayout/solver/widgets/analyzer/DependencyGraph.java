package androidx.constraintlayout.solver.widgets.analyzer;

import OooO0oO.OooOo;
import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class DependencyGraph {
    private static final boolean USE_GROUPS = true;
    private ConstraintWidgetContainer container;
    private ConstraintWidgetContainer mContainer;
    private boolean mNeedBuildGraph = true;
    private boolean mNeedRedoMeasures = true;
    private ArrayList<WidgetRun> mRuns = new ArrayList<>();
    private ArrayList<RunGroup> runGroups = new ArrayList<>();
    private BasicMeasure.Measurer mMeasurer = null;
    private BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    ArrayList<RunGroup> mGroups = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        this.container = constraintWidgetContainer;
        this.mContainer = constraintWidgetContainer;
    }

    private void applyGroup(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<RunGroup> arrayList, RunGroup runGroup) {
        int i3;
        DependencyNode dependencyNode3;
        ArrayList<RunGroup> arrayList2;
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun.runGroup == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            if (widgetRun == constraintWidgetContainer.horizontalRun || widgetRun == constraintWidgetContainer.verticalRun) {
                return;
            }
            if (runGroup == null) {
                runGroup = new RunGroup(widgetRun, i2);
                arrayList.add(runGroup);
            }
            RunGroup runGroup2 = runGroup;
            widgetRun.runGroup = runGroup2;
            runGroup2.add(widgetRun);
            for (Dependency dependency : widgetRun.start.dependencies) {
                if (dependency instanceof DependencyNode) {
                    i3 = i;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                    applyGroup((DependencyNode) dependency, i3, 0, dependencyNode3, arrayList2, runGroup2);
                } else {
                    i3 = i;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                }
                i = i3;
                dependencyNode2 = dependencyNode3;
                arrayList = arrayList2;
            }
            int i4 = i;
            DependencyNode dependencyNode4 = dependencyNode2;
            ArrayList<RunGroup> arrayList3 = arrayList;
            for (Dependency dependency2 : widgetRun.end.dependencies) {
                if (dependency2 instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency2, i4, 1, dependencyNode4, arrayList3, runGroup2);
                }
            }
            if (i4 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.dependencies) {
                    if (dependency3 instanceof DependencyNode) {
                        applyGroup((DependencyNode) dependency3, i4, 2, dependencyNode4, arrayList3, runGroup2);
                    }
                }
            }
            for (DependencyNode dependencyNode5 : widgetRun.start.targets) {
                if (dependencyNode5 == dependencyNode4) {
                    runGroup2.dual = true;
                }
                applyGroup(dependencyNode5, i4, 0, dependencyNode4, arrayList3, runGroup2);
            }
            for (DependencyNode dependencyNode6 : widgetRun.end.targets) {
                if (dependencyNode6 == dependencyNode4) {
                    runGroup2.dual = true;
                }
                applyGroup(dependencyNode6, i4, 1, dependencyNode4, arrayList3, runGroup2);
            }
            if (i4 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator<DependencyNode> it = ((VerticalWidgetRun) widgetRun).baseline.targets.iterator();
                while (it.hasNext()) {
                    applyGroup(it.next(), i4, 2, dependencyNode4, arrayList3, runGroup2);
                }
            }
        }
    }

    private boolean basicMeasureWidgets(ConstraintWidgetContainer constraintWidgetContainer) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        float f;
        float f2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        ArrayList<ConstraintWidget> arrayList = constraintWidgetContainer.mChildren;
        int size = arrayList.size();
        byte b = 0;
        int i2 = 0;
        while (i2 < size) {
            ConstraintWidget constraintWidget = arrayList.get(i2);
            i2++;
            ConstraintWidget constraintWidget2 = constraintWidget;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget2.mListDimensionBehaviors;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr2[b == true ? 1 : 0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr2[1];
            if (constraintWidget2.getVisibility() == 8) {
                constraintWidget2.measured = true;
            } else {
                if (constraintWidget2.mMatchConstraintPercentWidth < 1.0f && dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget2.mMatchConstraintDefaultWidth = 2;
                }
                if (constraintWidget2.mMatchConstraintPercentHeight < 1.0f && dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget2.mMatchConstraintDefaultHeight = 2;
                }
                if (constraintWidget2.getDimensionRatio() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour9 == dimensionBehaviour11 && (dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget2.mMatchConstraintDefaultWidth = 3;
                    } else if (dimensionBehaviour10 == dimensionBehaviour11 && (dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget2.mMatchConstraintDefaultHeight = 3;
                    } else if (dimensionBehaviour9 == dimensionBehaviour11 && dimensionBehaviour10 == dimensionBehaviour11) {
                        if (constraintWidget2.mMatchConstraintDefaultWidth == 0) {
                            constraintWidget2.mMatchConstraintDefaultWidth = 3;
                        }
                        if (constraintWidget2.mMatchConstraintDefaultHeight == 0) {
                            constraintWidget2.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour9 == dimensionBehaviour12 && constraintWidget2.mMatchConstraintDefaultWidth == 1 && (constraintWidget2.mLeft.mTarget == null || constraintWidget2.mRight.mTarget == null)) {
                    dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour10 == dimensionBehaviour12 && constraintWidget2.mMatchConstraintDefaultHeight == 1 && (constraintWidget2.mTop.mTarget == null || constraintWidget2.mBottom.mTarget == null)) {
                    dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget2.horizontalRun;
                horizontalWidgetRun.dimensionBehavior = dimensionBehaviour9;
                int i3 = constraintWidget2.mMatchConstraintDefaultWidth;
                horizontalWidgetRun.matchConstraintsType = i3;
                VerticalWidgetRun verticalWidgetRun = constraintWidget2.verticalRun;
                verticalWidgetRun.dimensionBehavior = dimensionBehaviour10;
                int i4 = constraintWidget2.mMatchConstraintDefaultHeight;
                verticalWidgetRun.matchConstraintsType = i4;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                byte b2 = b == true ? 1 : 0;
                if ((dimensionBehaviour9 == dimensionBehaviour13 || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour10 == dimensionBehaviour13 || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviour10;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dimensionBehaviour9;
                    int width = constraintWidget2.getWidth();
                    if (dimensionBehaviour15 == dimensionBehaviour13) {
                        width = (constraintWidgetContainer.getWidth() - constraintWidget2.mLeft.mMargin) - constraintWidget2.mRight.mMargin;
                        dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i5 = width;
                    int height = constraintWidget2.getHeight();
                    if (dimensionBehaviour14 == dimensionBehaviour13) {
                        height = (constraintWidgetContainer.getHeight() - constraintWidget2.mTop.mMargin) - constraintWidget2.mBottom.mMargin;
                        dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    measure(constraintWidget2, dimensionBehaviour15, i5, dimensionBehaviour14, height);
                    constraintWidget2.horizontalRun.dimension.resolve(constraintWidget2.getWidth());
                    constraintWidget2.verticalRun.dimension.resolve(constraintWidget2.getHeight());
                    constraintWidget2.measured = true;
                } else {
                    if (dimensionBehaviour9 == dimensionBehaviour12) {
                        dimensionBehaviour2 = dimensionBehaviour12;
                        f2 = 0.5f;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        f = 1.0f;
                        if (dimensionBehaviour10 != dimensionBehaviour16 && dimensionBehaviour10 != ConstraintWidget.DimensionBehaviour.FIXED) {
                            dimensionBehaviour = dimensionBehaviour10;
                            i = 3;
                        } else if (i3 == 3) {
                            if (dimensionBehaviour10 == dimensionBehaviour16) {
                                measure(constraintWidget2, dimensionBehaviour16, 0, dimensionBehaviour16, 0);
                            }
                            int height2 = constraintWidget2.getHeight();
                            int i6 = (int) ((height2 * constraintWidget2.mDimensionRatio) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                            measure(constraintWidget2, dimensionBehaviour17, i6, dimensionBehaviour17, height2);
                            constraintWidget2.horizontalRun.dimension.resolve(constraintWidget2.getWidth());
                            constraintWidget2.verticalRun.dimension.resolve(constraintWidget2.getHeight());
                            constraintWidget2.measured = true;
                        } else if (i3 == 1) {
                            measure(constraintWidget2, dimensionBehaviour16, 0, dimensionBehaviour10, 0);
                            constraintWidget2.horizontalRun.dimension.wrapValue = constraintWidget2.getWidth();
                        } else {
                            dimensionBehaviour = dimensionBehaviour10;
                            i = 3;
                            if (i3 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = constraintWidgetContainer.mListDimensionBehaviors[b2];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour18 == dimensionBehaviour19 || dimensionBehaviour18 == dimensionBehaviour13) {
                                    measure(constraintWidget2, dimensionBehaviour19, (int) ((constraintWidget2.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour, constraintWidget2.getHeight());
                                    constraintWidget2.horizontalRun.dimension.resolve(constraintWidget2.getWidth());
                                    constraintWidget2.verticalRun.dimension.resolve(constraintWidget2.getHeight());
                                    constraintWidget2.measured = true;
                                }
                            } else {
                                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                                if (constraintAnchorArr[b2].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                                    measure(constraintWidget2, dimensionBehaviour16, 0, dimensionBehaviour, 0);
                                    constraintWidget2.horizontalRun.dimension.resolve(constraintWidget2.getWidth());
                                    constraintWidget2.verticalRun.dimension.resolve(constraintWidget2.getHeight());
                                    constraintWidget2.measured = true;
                                }
                            }
                        }
                    } else {
                        dimensionBehaviour = dimensionBehaviour10;
                        i = 3;
                        dimensionBehaviour2 = dimensionBehaviour12;
                        f = 1.0f;
                        f2 = 0.5f;
                    }
                    if (dimensionBehaviour != dimensionBehaviour2 || (dimensionBehaviour9 != (dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && dimensionBehaviour9 != ConstraintWidget.DimensionBehaviour.FIXED)) {
                        dimensionBehaviour3 = dimensionBehaviour9;
                    } else if (i4 == i) {
                        if (dimensionBehaviour9 == dimensionBehaviour7) {
                            measure(constraintWidget2, dimensionBehaviour7, 0, dimensionBehaviour7, 0);
                        }
                        int width2 = constraintWidget2.getWidth();
                        float f3 = constraintWidget2.mDimensionRatio;
                        if (constraintWidget2.getDimensionRatioSide() == -1) {
                            f3 = f / f3;
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.FIXED;
                        measure(constraintWidget2, dimensionBehaviour20, width2, dimensionBehaviour20, (int) ((width2 * f3) + f2));
                        constraintWidget2.horizontalRun.dimension.resolve(constraintWidget2.getWidth());
                        constraintWidget2.verticalRun.dimension.resolve(constraintWidget2.getHeight());
                        constraintWidget2.measured = true;
                    } else if (i4 == 1) {
                        measure(constraintWidget2, dimensionBehaviour9, 0, dimensionBehaviour7, 0);
                        constraintWidget2.verticalRun.dimension.wrapValue = constraintWidget2.getHeight();
                    } else {
                        dimensionBehaviour3 = dimensionBehaviour9;
                        if (i4 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = constraintWidgetContainer.mListDimensionBehaviors[1];
                            dimensionBehaviour8 = dimensionBehaviour;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour21 == dimensionBehaviour22 || dimensionBehaviour21 == dimensionBehaviour13) {
                                measure(constraintWidget2, dimensionBehaviour3, constraintWidget2.getWidth(), dimensionBehaviour22, (int) ((constraintWidget2.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + f2));
                                constraintWidget2.horizontalRun.dimension.resolve(constraintWidget2.getWidth());
                                constraintWidget2.verticalRun.dimension.resolve(constraintWidget2.getHeight());
                                constraintWidget2.measured = true;
                            }
                            dimensionBehaviour = dimensionBehaviour8;
                        } else {
                            dimensionBehaviour8 = dimensionBehaviour;
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget2.mListAnchors;
                            if (constraintAnchorArr2[2].mTarget == null || constraintAnchorArr2[i].mTarget == null) {
                                measure(constraintWidget2, dimensionBehaviour7, 0, dimensionBehaviour8, 0);
                                constraintWidget2.horizontalRun.dimension.resolve(constraintWidget2.getWidth());
                                constraintWidget2.verticalRun.dimension.resolve(constraintWidget2.getHeight());
                                constraintWidget2.measured = true;
                            }
                            dimensionBehaviour = dimensionBehaviour8;
                        }
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour2 && dimensionBehaviour == dimensionBehaviour2) {
                        if (i3 == 1 || i4 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour23 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            measure(constraintWidget2, dimensionBehaviour23, 0, dimensionBehaviour23, 0);
                            constraintWidget2.horizontalRun.dimension.wrapValue = constraintWidget2.getWidth();
                            constraintWidget2.verticalRun.dimension.wrapValue = constraintWidget2.getHeight();
                        } else if (i4 == 2 && i3 == 2 && (((dimensionBehaviour4 = (dimensionBehaviourArr = constraintWidgetContainer.mListDimensionBehaviors)[b2]) == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED) || dimensionBehaviour4 == dimensionBehaviour5) && ((dimensionBehaviour6 = dimensionBehaviourArr[1]) == dimensionBehaviour5 || dimensionBehaviour6 == dimensionBehaviour5))) {
                            measure(constraintWidget2, dimensionBehaviour5, (int) ((constraintWidget2.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + f2), dimensionBehaviour5, (int) ((constraintWidget2.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + f2));
                            constraintWidget2.horizontalRun.dimension.resolve(constraintWidget2.getWidth());
                            constraintWidget2.verticalRun.dimension.resolve(constraintWidget2.getHeight());
                            constraintWidget2.measured = true;
                        }
                    }
                }
                b = b2;
            }
        }
        return b == true ? 1 : 0;
    }

    private int computeWrap(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        int size = this.mGroups.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.mGroups.get(i2).computeWrapSize(constraintWidgetContainer, i));
        }
        return (int) jMax;
    }

    private void displayGraph() {
        ArrayList<WidgetRun> arrayList = this.mRuns;
        int size = arrayList.size();
        String strGenerateDisplayGraph = "digraph {\n";
        int i = 0;
        while (i < size) {
            WidgetRun widgetRun = arrayList.get(i);
            i++;
            strGenerateDisplayGraph = generateDisplayGraph(widgetRun, strGenerateDisplayGraph);
        }
        String strOooOoo0 = OooOo.OooOoo0(strGenerateDisplayGraph, "\n}\n");
        System.out.println("content:<<\n" + strOooOoo0 + "\n>>");
    }

    private void findGroup(WidgetRun widgetRun, int i, ArrayList<RunGroup> arrayList) {
        for (Dependency dependency : widgetRun.start.dependencies) {
            if (dependency instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency, i, 0, widgetRun.end, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency).start, i, 0, widgetRun.end, arrayList, null);
            }
        }
        for (Dependency dependency2 : widgetRun.end.dependencies) {
            if (dependency2 instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency2, i, 1, widgetRun.start, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency2).end, i, 1, widgetRun.start, arrayList, null);
            }
        }
        int i2 = i;
        if (i2 == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.dependencies) {
                if (dependency3 instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency3, i2, 2, null, arrayList, null);
                }
                i2 = i;
            }
        }
    }

    private String generateChainDisplayGraph(ChainRun chainRun, String str) {
        int i = chainRun.orientation;
        String str2 = "cluster_" + chainRun.widget.getDebugName();
        String strOooOO0O = OooOo.OooOO0O("subgraph ", i == 0 ? OooOo.OooOoo0(str2, "_h") : OooOo.OooOoo0(str2, "_v"), " {\n");
        ArrayList<WidgetRun> arrayList = chainRun.widgets;
        int size = arrayList.size();
        String strGenerateDisplayGraph = "";
        int i2 = 0;
        while (i2 < size) {
            WidgetRun widgetRun = arrayList.get(i2);
            i2++;
            WidgetRun widgetRun2 = widgetRun;
            String debugName = widgetRun2.widget.getDebugName();
            strOooOO0O = OooOo.OooOoo(strOooOO0O, i == 0 ? OooOo.OooOoo0(debugName, "_HORIZONTAL") : OooOo.OooOoo0(debugName, "_VERTICAL"), ";\n");
            strGenerateDisplayGraph = generateDisplayGraph(widgetRun2, strGenerateDisplayGraph);
        }
        return OooOo.OooOoo(str, strGenerateDisplayGraph, OooOo.OooOoo0(strOooOO0O, "}\n"));
    }

    private String generateDisplayGraph(WidgetRun widgetRun, String str) {
        boolean z;
        DependencyNode dependencyNode = widgetRun.start;
        DependencyNode dependencyNode2 = widgetRun.end;
        if (!(widgetRun instanceof HelperReferences) && dependencyNode.dependencies.isEmpty() && (dependencyNode2.dependencies.isEmpty() && dependencyNode.targets.isEmpty()) && dependencyNode2.targets.isEmpty()) {
            return str;
        }
        StringBuilder sbOooOo0O = OooOo.OooOo0O(str);
        sbOooOo0O.append(nodeDefinition(widgetRun));
        String string = sbOooOo0O.toString();
        boolean zIsCenteredConnection = isCenteredConnection(dependencyNode, dependencyNode2);
        String strGenerateDisplayNode = generateDisplayNode(dependencyNode2, zIsCenteredConnection, generateDisplayNode(dependencyNode, zIsCenteredConnection, string));
        boolean z2 = widgetRun instanceof VerticalWidgetRun;
        if (z2) {
            strGenerateDisplayNode = generateDisplayNode(((VerticalWidgetRun) widgetRun).baseline, zIsCenteredConnection, strGenerateDisplayNode);
        }
        if ((widgetRun instanceof HorizontalWidgetRun) || (((z = widgetRun instanceof ChainRun)) && ((ChainRun) widgetRun).orientation == 0)) {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = widgetRun.widget.getHorizontalDimensionBehaviour();
            if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.targets.isEmpty() && dependencyNode2.targets.isEmpty()) {
                    strGenerateDisplayNode = OooOo.OooOoo0(strGenerateDisplayNode, "\n" + dependencyNode2.name() + " -> " + dependencyNode.name() + "\n");
                } else if (dependencyNode.targets.isEmpty() && !dependencyNode2.targets.isEmpty()) {
                    strGenerateDisplayNode = OooOo.OooOoo0(strGenerateDisplayNode, "\n" + dependencyNode.name() + " -> " + dependencyNode2.name() + "\n");
                }
            } else if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.widget.getDimensionRatio() > 0.0f) {
                widgetRun.widget.getDebugName();
            }
        } else if (z2 || (z && ((ChainRun) widgetRun).orientation == 1)) {
            ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = widgetRun.widget.getVerticalDimensionBehaviour();
            if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.targets.isEmpty() && dependencyNode2.targets.isEmpty()) {
                    strGenerateDisplayNode = OooOo.OooOoo0(strGenerateDisplayNode, "\n" + dependencyNode2.name() + " -> " + dependencyNode.name() + "\n");
                } else if (dependencyNode.targets.isEmpty() && !dependencyNode2.targets.isEmpty()) {
                    strGenerateDisplayNode = OooOo.OooOoo0(strGenerateDisplayNode, "\n" + dependencyNode.name() + " -> " + dependencyNode2.name() + "\n");
                }
            } else if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.widget.getDimensionRatio() > 0.0f) {
                widgetRun.widget.getDebugName();
            }
        }
        return widgetRun instanceof ChainRun ? generateChainDisplayGraph((ChainRun) widgetRun, strGenerateDisplayNode) : strGenerateDisplayNode;
    }

    private String generateDisplayNode(DependencyNode dependencyNode, boolean z, String str) {
        for (DependencyNode dependencyNode2 : dependencyNode.targets) {
            StringBuilder sbOooOo = OooOo.OooOo("\n" + dependencyNode.name(), " -> ");
            sbOooOo.append(dependencyNode2.name());
            String string = sbOooOo.toString();
            if (dependencyNode.margin > 0 || z || (dependencyNode.run instanceof HelperReferences)) {
                String strOooOoo0 = OooOo.OooOoo0(string, C3034d9.i.f8177d);
                if (dependencyNode.margin > 0) {
                    strOooOoo0 = OooOo.OooOOO(OooOo.OooOo(strOooOoo0, "label=\""), dependencyNode.margin, "\"");
                    if (z) {
                        strOooOoo0 = OooOo.OooOoo0(strOooOoo0, ",");
                    }
                }
                if (z) {
                    strOooOoo0 = OooOo.OooOoo0(strOooOoo0, " style=dashed ");
                }
                if (dependencyNode.run instanceof HelperReferences) {
                    strOooOoo0 = OooOo.OooOoo0(strOooOoo0, " style=bold,color=gray ");
                }
                string = OooOo.OooOoo0(strOooOoo0, C3034d9.i.f8179e);
            }
            str = OooOo.OooOoo0(str, OooOo.OooOoo0(string, "\n"));
        }
        return str;
    }

    private boolean isCenteredConnection(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
        Iterator<DependencyNode> it = dependencyNode.targets.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() != dependencyNode2) {
                i++;
            }
        }
        Iterator<DependencyNode> it2 = dependencyNode2.targets.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next() != dependencyNode) {
                i2++;
            }
        }
        return i > 0 && i2 > 0;
    }

    private void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure.Measure measure = this.mMeasure;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i;
        measure.verticalDimension = i2;
        this.mMeasurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    private String nodeDefinition(WidgetRun widgetRun) {
        String strOooOoo0;
        String strOooOOO;
        String strOooOoo02;
        boolean z = widgetRun instanceof VerticalWidgetRun;
        String debugName = widgetRun.widget.getDebugName();
        ConstraintWidget constraintWidget = widgetRun.widget;
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = !z ? constraintWidget.getHorizontalDimensionBehaviour() : constraintWidget.getVerticalDimensionBehaviour();
        RunGroup runGroup = widgetRun.runGroup;
        String strOooOoo03 = OooOo.OooOoo0(OooOo.OooOoo0(OooOo.OooOoo0(!z ? OooOo.OooOoo0(debugName, "_HORIZONTAL") : OooOo.OooOoo0(debugName, "_VERTICAL"), " [shape=none, label=<"), "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"), "  <TR>");
        if (z) {
            String strOooOoo04 = OooOo.OooOoo0(strOooOoo03, "    <TD ");
            if (widgetRun.start.resolved) {
                strOooOoo04 = OooOo.OooOoo0(strOooOoo04, " BGCOLOR=\"green\"");
            }
            strOooOoo0 = OooOo.OooOoo0(strOooOoo04, " PORT=\"TOP\" BORDER=\"1\">T</TD>");
        } else {
            String strOooOoo05 = OooOo.OooOoo0(strOooOoo03, "    <TD ");
            if (widgetRun.start.resolved) {
                strOooOoo05 = OooOo.OooOoo0(strOooOoo05, " BGCOLOR=\"green\"");
            }
            strOooOoo0 = OooOo.OooOoo0(strOooOoo05, " PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        String strOooOoo06 = OooOo.OooOoo0(strOooOoo0, "    <TD BORDER=\"1\" ");
        boolean z2 = widgetRun.dimension.resolved;
        if (z2 && !widgetRun.widget.measured) {
            strOooOoo06 = OooOo.OooOoo0(strOooOoo06, " BGCOLOR=\"green\" ");
        } else if (z2 && widgetRun.widget.measured) {
            strOooOoo06 = OooOo.OooOoo0(strOooOoo06, " BGCOLOR=\"lightgray\" ");
        } else if (!z2 && widgetRun.widget.measured) {
            strOooOoo06 = OooOo.OooOoo0(strOooOoo06, " BGCOLOR=\"yellow\" ");
        }
        if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            strOooOoo06 = OooOo.OooOoo0(strOooOoo06, "style=\"dashed\"");
        }
        if (runGroup != null) {
            StringBuilder sb = new StringBuilder(" [");
            sb.append(runGroup.groupIndex + 1);
            sb.append("/");
            strOooOOO = OooOo.OooOOO(sb, RunGroup.index, C3034d9.i.f8179e);
        } else {
            strOooOOO = "";
        }
        String str = strOooOoo06 + ">" + debugName + strOooOOO + " </TD>";
        if (z) {
            String strOooOoo07 = OooOo.OooOoo0(str, "    <TD ");
            if ((widgetRun instanceof VerticalWidgetRun) && ((VerticalWidgetRun) widgetRun).baseline.resolved) {
                strOooOoo07 = OooOo.OooOoo0(strOooOoo07, " BGCOLOR=\"green\"");
            }
            String strOooOoo08 = OooOo.OooOoo0(OooOo.OooOoo0(strOooOoo07, " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"), "    <TD ");
            if (widgetRun.end.resolved) {
                strOooOoo08 = OooOo.OooOoo0(strOooOoo08, " BGCOLOR=\"green\"");
            }
            strOooOoo02 = OooOo.OooOoo0(strOooOoo08, " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        } else {
            String strOooOoo09 = OooOo.OooOoo0(str, "    <TD ");
            if (widgetRun.end.resolved) {
                strOooOoo09 = OooOo.OooOoo0(strOooOoo09, " BGCOLOR=\"green\"");
            }
            strOooOoo02 = OooOo.OooOoo0(strOooOoo09, " PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        return OooOo.OooOoo0(OooOo.OooOoo0(strOooOoo02, "  </TR></TABLE>"), ">];\n");
    }

    public void buildGraph() {
        buildGraph(this.mRuns);
        this.mGroups.clear();
        RunGroup.index = 0;
        findGroup(this.container.horizontalRun, 0, this.mGroups);
        findGroup(this.container.verticalRun, 1, this.mGroups);
        this.mNeedBuildGraph = false;
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        if (this.mNeedBuildGraph) {
            buildGraph();
            ArrayList<ConstraintWidget> arrayList = this.container.mChildren;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                i++;
                ConstraintWidget constraintWidget2 = constraintWidget;
                boolean[] zArr = constraintWidget2.isTerminalWidget;
                zArr[0] = true;
                zArr[1] = true;
                if (constraintWidget2 instanceof Barrier) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            ArrayList<RunGroup> arrayList2 = this.mGroups;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                RunGroup runGroup = arrayList2.get(i2);
                i2++;
                RunGroup runGroup2 = runGroup;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                runGroup2.defineTerminalWidgets(dimensionBehaviour == dimensionBehaviour3, dimensionBehaviour2 == dimensionBehaviour3);
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.mNeedBuildGraph || this.mNeedRedoMeasures) {
            ArrayList<ConstraintWidget> arrayList = this.container.mChildren;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                i++;
                ConstraintWidget constraintWidget2 = constraintWidget;
                constraintWidget2.measured = false;
                constraintWidget2.horizontalRun.reset();
                constraintWidget2.verticalRun.reset();
            }
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            constraintWidgetContainer.measured = false;
            constraintWidgetContainer.horizontalRun.reset();
            this.container.verticalRun.reset();
            this.mNeedRedoMeasures = false;
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.container.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.container.getDimensionBehaviour(1);
        if (this.mNeedBuildGraph) {
            buildGraph();
        }
        int x = this.container.getX();
        int y = this.container.getY();
        this.container.horizontalRun.start.resolve(x);
        this.container.verticalRun.start.resolve(y);
        measureWidgets();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) {
            if (z) {
                ArrayList<WidgetRun> arrayList2 = this.mRuns;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    WidgetRun widgetRun = arrayList2.get(i2);
                    i2++;
                    if (!widgetRun.supportsWrapComputation()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.container;
                constraintWidgetContainer2.setWidth(computeWrap(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.container;
                constraintWidgetContainer3.horizontalRun.dimension.resolve(constraintWidgetContainer3.getWidth());
            }
            if (z && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.container;
                constraintWidgetContainer4.setHeight(computeWrap(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.container;
                constraintWidgetContainer5.verticalRun.dimension.resolve(constraintWidgetContainer5.getHeight());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.container;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer6.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int width = constraintWidgetContainer6.getWidth() + x;
            this.container.horizontalRun.end.resolve(width);
            this.container.horizontalRun.dimension.resolve(width - x);
            measureWidgets();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.container;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidgetContainer7.mListDimensionBehaviors[1];
            if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer7.getHeight() + y;
                this.container.verticalRun.end.resolve(height);
                this.container.verticalRun.dimension.resolve(height - y);
            }
            measureWidgets();
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList<WidgetRun> arrayList3 = this.mRuns;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            WidgetRun widgetRun2 = arrayList3.get(i3);
            i3++;
            WidgetRun widgetRun3 = widgetRun2;
            if (widgetRun3.widget != this.container || widgetRun3.resolved) {
                widgetRun3.applyToWidget();
            }
        }
        ArrayList<WidgetRun> arrayList4 = this.mRuns;
        int size4 = arrayList4.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size4) {
                z3 = true;
                break;
            }
            WidgetRun widgetRun4 = arrayList4.get(i4);
            i4++;
            WidgetRun widgetRun5 = widgetRun4;
            if (z2 || widgetRun5.widget != this.container) {
                if (!widgetRun5.start.resolved || ((!widgetRun5.end.resolved && !(widgetRun5 instanceof GuidelineReference)) || (!widgetRun5.dimension.resolved && !(widgetRun5 instanceof ChainRun) && !(widgetRun5 instanceof GuidelineReference)))) {
                    break;
                }
            }
        }
        this.container.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.container.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public boolean directMeasureSetup(boolean z) {
        if (this.mNeedBuildGraph) {
            ArrayList<ConstraintWidget> arrayList = this.container.mChildren;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                i++;
                ConstraintWidget constraintWidget2 = constraintWidget;
                constraintWidget2.measured = false;
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget2.horizontalRun;
                horizontalWidgetRun.dimension.resolved = false;
                horizontalWidgetRun.resolved = false;
                horizontalWidgetRun.reset();
                VerticalWidgetRun verticalWidgetRun = constraintWidget2.verticalRun;
                verticalWidgetRun.dimension.resolved = false;
                verticalWidgetRun.resolved = false;
                verticalWidgetRun.reset();
            }
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            constraintWidgetContainer.measured = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.horizontalRun;
            horizontalWidgetRun2.dimension.resolved = false;
            horizontalWidgetRun2.resolved = false;
            horizontalWidgetRun2.reset();
            VerticalWidgetRun verticalWidgetRun2 = this.container.verticalRun;
            verticalWidgetRun2.dimension.resolved = false;
            verticalWidgetRun2.resolved = false;
            verticalWidgetRun2.reset();
            buildGraph();
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        this.container.horizontalRun.start.resolve(0);
        this.container.verticalRun.start.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.container.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = this.container.getDimensionBehaviour(1);
        int x = this.container.getX();
        int y = this.container.getY();
        if (z && (dimensionBehaviour2 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour)) {
            ArrayList<WidgetRun> arrayList = this.mRuns;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                WidgetRun widgetRun = arrayList.get(i2);
                i2++;
                WidgetRun widgetRun2 = widgetRun;
                if (widgetRun2.orientation == i && !widgetRun2.supportsWrapComputation()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.container.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    ConstraintWidgetContainer constraintWidgetContainer = this.container;
                    constraintWidgetContainer.setWidth(computeWrap(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.container;
                    constraintWidgetContainer2.horizontalRun.dimension.resolve(constraintWidgetContainer2.getWidth());
                }
            } else if (z && dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer3 = this.container;
                constraintWidgetContainer3.setHeight(computeWrap(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.container;
                constraintWidgetContainer4.verticalRun.dimension.resolve(constraintWidgetContainer4.getHeight());
            }
        }
        if (i == 0) {
            ConstraintWidgetContainer constraintWidgetContainer5 = this.container;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer5.mListDimensionBehaviors[0];
            if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int width = constraintWidgetContainer5.getWidth() + x;
                this.container.horizontalRun.end.resolve(width);
                this.container.horizontalRun.dimension.resolve(width - x);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidgetContainer constraintWidgetContainer6 = this.container;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer6.mListDimensionBehaviors[1];
            if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer6.getHeight() + y;
                this.container.verticalRun.end.resolve(height);
                this.container.verticalRun.dimension.resolve(height - y);
                z2 = true;
            }
            z2 = false;
        }
        measureWidgets();
        ArrayList<WidgetRun> arrayList2 = this.mRuns;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            WidgetRun widgetRun3 = arrayList2.get(i3);
            i3++;
            WidgetRun widgetRun4 = widgetRun3;
            if (widgetRun4.orientation == i && (widgetRun4.widget != this.container || widgetRun4.resolved)) {
                widgetRun4.applyToWidget();
            }
        }
        ArrayList<WidgetRun> arrayList3 = this.mRuns;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                z3 = true;
                break;
            }
            WidgetRun widgetRun5 = arrayList3.get(i4);
            i4++;
            WidgetRun widgetRun6 = widgetRun5;
            if (widgetRun6.orientation == i && (z2 || widgetRun6.widget != this.container)) {
                if (!widgetRun6.start.resolved || !widgetRun6.end.resolved || (!(widgetRun6 instanceof ChainRun) && !widgetRun6.dimension.resolved)) {
                    break;
                }
            }
        }
        this.container.setHorizontalDimensionBehaviour(dimensionBehaviour2);
        this.container.setVerticalDimensionBehaviour(dimensionBehaviour3);
        return z3;
    }

    public void invalidateGraph() {
        this.mNeedBuildGraph = true;
    }

    public void invalidateMeasures() {
        this.mNeedRedoMeasures = true;
    }

    public void measureWidgets() {
        DimensionDependency dimensionDependency;
        ArrayList<ConstraintWidget> arrayList = this.container.mChildren;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ConstraintWidget constraintWidget = arrayList.get(i);
            i++;
            ConstraintWidget constraintWidget2 = constraintWidget;
            if (!constraintWidget2.measured) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.mListDimensionBehaviors;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i2 = constraintWidget2.mMatchConstraintDefaultWidth;
                int i3 = constraintWidget2.mMatchConstraintDefaultHeight;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1);
                boolean z2 = dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i3 == 1);
                DimensionDependency dimensionDependency2 = constraintWidget2.horizontalRun.dimension;
                boolean z3 = dimensionDependency2.resolved;
                DimensionDependency dimensionDependency3 = constraintWidget2.verticalRun.dimension;
                boolean z4 = dimensionDependency3.resolved;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    measure(constraintWidget2, dimensionBehaviour4, dimensionDependency2.value, dimensionBehaviour4, dimensionDependency3.value);
                    constraintWidget2.measured = true;
                } else if (z3 && z2) {
                    measure(constraintWidget2, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency2.value, dimensionBehaviour3, dimensionDependency3.value);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget2.verticalRun.dimension.wrapValue = constraintWidget2.getHeight();
                    } else {
                        constraintWidget2.verticalRun.dimension.resolve(constraintWidget2.getHeight());
                        constraintWidget2.measured = true;
                    }
                } else if (z4 && z) {
                    measure(constraintWidget2, dimensionBehaviour3, dimensionDependency2.value, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency3.value);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget2.horizontalRun.dimension.wrapValue = constraintWidget2.getWidth();
                    } else {
                        constraintWidget2.horizontalRun.dimension.resolve(constraintWidget2.getWidth());
                        constraintWidget2.measured = true;
                    }
                }
                if (constraintWidget2.measured && (dimensionDependency = constraintWidget2.verticalRun.baselineDimension) != null) {
                    dimensionDependency.resolve(constraintWidget2.getBaselineDistance());
                }
            }
        }
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.mContainer.horizontalRun.clear();
        this.mContainer.verticalRun.clear();
        arrayList.add(this.mContainer.horizontalRun);
        arrayList.add(this.mContainer.verticalRun);
        ArrayList<ConstraintWidget> arrayList2 = this.mContainer.mChildren;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            ConstraintWidget constraintWidget = arrayList2.get(i2);
            i2++;
            ConstraintWidget constraintWidget2 = constraintWidget;
            if (constraintWidget2 instanceof Guideline) {
                arrayList.add(new GuidelineReference(constraintWidget2));
            } else {
                if (constraintWidget2.isInHorizontalChain()) {
                    if (constraintWidget2.horizontalChainRun == null) {
                        constraintWidget2.horizontalChainRun = new ChainRun(constraintWidget2, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget2.horizontalChainRun);
                } else {
                    arrayList.add(constraintWidget2.horizontalRun);
                }
                if (constraintWidget2.isInVerticalChain()) {
                    if (constraintWidget2.verticalChainRun == null) {
                        constraintWidget2.verticalChainRun = new ChainRun(constraintWidget2, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget2.verticalChainRun);
                } else {
                    arrayList.add(constraintWidget2.verticalRun);
                }
                if (constraintWidget2 instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(constraintWidget2));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            WidgetRun widgetRun = arrayList.get(i3);
            i3++;
            widgetRun.clear();
        }
        int size3 = arrayList.size();
        while (i < size3) {
            WidgetRun widgetRun2 = arrayList.get(i);
            i++;
            WidgetRun widgetRun3 = widgetRun2;
            if (widgetRun3.widget != this.mContainer) {
                widgetRun3.apply();
            }
        }
    }
}
