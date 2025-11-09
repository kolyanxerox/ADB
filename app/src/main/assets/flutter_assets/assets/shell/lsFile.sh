if [ -z "$prefix" ]; then
  echo "#tab_currentPath";
  ls;
elif [ -e "$prefix" ]; then
  if [ -f "$prefix" ]; then
    echo "#tab_existFile";
  elif [ -d "$prefix" ]; then
    echo "#tab_existFolder";
    ls "$prefix";
  fi;
else
  if [[ "$prefix" == *"/"* ]]; then
    parentPath="${prefix%/*}";
    if [ -z "$parentPath" ]; then
      echo "#tab_existRoot";
      ls /;
    elif [ -d "$parentPath" ]; then
      echo "#tab_existParentFolder";
      ls "$parentPath/";
    else
      echo "#tab_notExist";
    fi;
  else
    echo "#tab_exitParent";
    ls;
  fi;
fi;
echo "--------------------------------"
echo "#tab_end_bins";
