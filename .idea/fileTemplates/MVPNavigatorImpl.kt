#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME} #end

import javax.inject.Inject

interface ${Name_Base}Navigator

#if($Is_Activity == true)
  class ${Name_Base}NavigatorImpl @Inject constructor(activity: ${Name_Base}Activity) : BaseNavigator(activity),
    ${Name_Base}Navigator
#else
  class ${Name_Base}NavigatorImpl @Inject constructor(fragment: ${Name_Base}Fragment) : BaseNavigator(fragment),
    ${Name_Base}Navigator
#end