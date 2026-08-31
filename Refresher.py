animals = ["cat", "dog", "blobfish", "Shark", "owl", "toad"]

def animal(name):
        for animal in animals:
         
            if animal == name:
                print(f' {name} found in the list')
                return
        print(f' {name} not found in the list')

animal('cat')
animal('penguin')


