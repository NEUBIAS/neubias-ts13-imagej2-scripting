#@ IOService io
#@ UIService ui
#@ OpService ops

// Task 1.1: open a single image using io.open(path)
image = io.open("/path/to/oocyte_4_1.tif")

// Task 1.2: find out the type/class of the returned object
println(image.class)

// Task 1.3: show the image in the UI
//ui.show(image)

// Task 2: find out the image dimensions and axis order
println("The image has ${image.numDimensions()} dimensions.")

dims = new long[image.numDimensions()]
image.dimensions(dims)

println("The dimensions are $dims")

// Task 3: Extract the first channel (i.e. index 0 from dimension 2)
